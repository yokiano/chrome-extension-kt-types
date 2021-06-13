@file:JsQualifier("chrome.extension")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.extension

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

external interface FetchProperties {
    var windowId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LastError {
    var message: String
}

external interface OnRequestEvent : Event<dynamic /* (request: Any, sender: runtime.MessageSender, sendResponse: (response: Any) -> Unit) -> Unit | (sender: runtime.MessageSender, sendResponse: (response: Any) -> Unit) -> Unit */>

external var inIncognitoContext: Boolean

external var lastError: LastError

external fun getBackgroundPage(): Window?

external fun getURL(path: String): String

external fun setUpdateUrlData(data: String)

external fun getViews(fetchProperties: FetchProperties = definedExternally): Array<Window>

external fun isAllowedFileSchemeAccess(callback: (isAllowedAccess: Boolean) -> Unit)

external fun isAllowedIncognitoAccess(callback: (isAllowedAccess: Boolean) -> Unit)

external fun sendRequest(extensionId: String, request: Any, responseCallback: (response: Any) -> Unit = definedExternally)

external fun sendRequest(extensionId: String, request: Any)

external fun sendRequest(request: Any, responseCallback: (response: Any) -> Unit = definedExternally)

external fun sendRequest(request: Any)

external fun getExtensionTabs(windowId: Number = definedExternally): Array<Window>

external var onRequest: OnRequestEvent

external var onRequestExternal: OnRequestEvent