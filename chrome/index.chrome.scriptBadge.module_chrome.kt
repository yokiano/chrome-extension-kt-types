@file:JsQualifier("chrome.scriptBadge")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.scriptBadge

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

external interface GetPopupDetails {
    var tabId: Number
}

external interface AttentionDetails {
    var tabId: Number
}

external interface SetPopupDetails {
    var tabId: Number
    var popup: String
}

external interface ScriptBadgeClickedEvent : Event<(tab: Tab) -> Unit>

external fun getPopup(details: GetPopupDetails, callback: Function<*>)

external fun getAttention(details: AttentionDetails)

external fun setPopup(details: SetPopupDetails)

external var onClicked: ScriptBadgeClickedEvent