@file:JsQualifier("chrome.pageAction")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.pageAction

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import chrome.tabs.Tab
import chrome.events.Event

external interface PageActionClickedEvent : Event<(tab: Tab) -> Unit>

external interface TitleDetails {
    var tabId: Number
    var title: String
}

external interface GetDetails {
    var tabId: Number
}

external interface PopupDetails {
    var tabId: Number
    var popup: String
}

external interface IconDetails {
    var tabId: Number
    var iconIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var imageData: dynamic /* ImageData? | `T$0`? */
        get() = definedExternally
        set(value) = definedExternally
    var path: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external fun hide(tabId: Number, callback: () -> Unit = definedExternally)

external fun show(tabId: Number, callback: () -> Unit = definedExternally)

external fun setTitle(details: TitleDetails, callback: () -> Unit = definedExternally)

external fun setPopup(details: PopupDetails, callback: () -> Unit = definedExternally)

external fun getTitle(details: GetDetails, callback: (result: String) -> Unit)

external fun getPopup(details: GetDetails, callback: (result: String) -> Unit)

external fun setIcon(details: IconDetails, callback: () -> Unit = definedExternally)

external var onClicked: PageActionClickedEvent