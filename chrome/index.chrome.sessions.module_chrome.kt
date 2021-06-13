@file:JsQualifier("chrome.sessions")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.sessions

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
import chrome.windows.Window
import chrome.events.Event

external interface Filter {
    var maxResults: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Session {
    var lastModified: Number
    var tab: Tab?
        get() = definedExternally
        set(value) = definedExternally
    var window: Window?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Device {
    var deviceName: String
    var sessions: Array<Session>
}

external interface SessionChangedEvent : Event<() -> Unit>

external var MAX_SESSION_RESULTS: Number

external fun getRecentlyClosed(filter: Filter, callback: (sessions: Array<Session>) -> Unit)

external fun getRecentlyClosed(callback: (sessions: Array<Session>) -> Unit)

external fun getDevices(filter: Filter, callback: (devices: Array<Device>) -> Unit)

external fun getDevices(callback: (devices: Array<Device>) -> Unit)

external fun restore(sessionId: String = definedExternally, callback: (restoredSession: Session) -> Unit = definedExternally)

external var onChanged: SessionChangedEvent