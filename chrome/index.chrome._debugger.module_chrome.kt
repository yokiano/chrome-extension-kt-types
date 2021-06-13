@file:JsQualifier("chrome._debugger")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome._debugger

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
import chrome.events.Event

external interface Debuggee {
    var tabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var extensionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var targetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TargetInfo {
    var type: String
    var id: String
    var tabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var extensionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var attached: Boolean
    var title: String
    var url: String
    var faviconUrl: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DebuggerDetachedEvent : Event<(source: Debuggee, reason: String) -> Unit>

external interface DebuggerEventEvent : Event<(source: Debuggee, method: String, params: Any) -> Unit>

external fun attach(target: Debuggee, requiredVersion: String, callback: () -> Unit = definedExternally)

external fun detach(target: Debuggee, callback: () -> Unit = definedExternally)

external fun sendCommand(target: Debuggee, method: String, commandParams: Any = definedExternally, callback: (result: Any) -> Unit = definedExternally)

external fun getTargets(callback: (result: Array<TargetInfo>) -> Unit)

external var onDetach: DebuggerDetachedEvent

external var onEvent: DebuggerEventEvent