package sample

import org.w3c.dom.*
import org.w3c.dom.events.EventListener
import kotlin.dom.appendText
import kotlin.dom.clear

fun processLogin(div: HTMLDivElement, form: HTMLFormElement) {
    val username = form.children["username"] as HTMLInputElement
    val password = form.children["password"] as HTMLInputElement
    if(username.value == "How" && password.value == "How") {
        div.clear()
        div.appendChild(welcomeView(logoutAction(div)))
    } else {
        val message = form.children["message"] as HTMLSpanElement
        message.clear()
        message.appendText("非法的用户名和密码")
        message.style.color = "red"
    }
}

fun loginAction(div: HTMLDivElement) = EventListener {
    it.preventDefault()
    processLogin(div, it.target as HTMLFormElement)
}