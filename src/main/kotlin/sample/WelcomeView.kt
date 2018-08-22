package sample

import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLSpanElement
import org.w3c.dom.events.EventListener
import kotlin.browser.document
import kotlin.dom.appendText

fun welcomeView(listener: EventListener): HTMLDivElement {
    val view = document.createElement("div") as HTMLDivElement
    view.id = "welcome"

    val message = document.createElement("span") as HTMLSpanElement
    message.id = "message"
    message.appendText("欢迎进入主页！")

    val button = document.createElement("button") as HTMLButtonElement
    button.textContent = "退出登录"
    button.id = "signout"
    button.addEventListener("click", listener)

    view.append(message, lineBreak(), button)
    return view
}