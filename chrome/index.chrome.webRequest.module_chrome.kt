@file:JsQualifier("chrome.webRequest")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.webRequest

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

external interface AuthCredentials {
    var username: String
    var password: String
}

external interface HttpHeader {
    var name: String
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
    var binaryValue: ArrayBuffer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BlockingResponse {
    var cancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var redirectUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseHeaders: Array<HttpHeader>?
        get() = definedExternally
        set(value) = definedExternally
    var authCredentials: AuthCredentials?
        get() = definedExternally
        set(value) = definedExternally
    var requestHeaders: Array<HttpHeader>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RequestFilter {
    var tabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var types: Array<String? /* "main_frame" | "sub_frame" | "stylesheet" | "script" | "image" | "font" | "object" | "xmlhttprequest" | "ping" | "csp_report" | "media" | "websocket" | "other" */>?
        get() = definedExternally
        set(value) = definedExternally
    var urls: Array<String>
    var windowId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UploadData {
    var bytes: ArrayBuffer?
        get() = definedExternally
        set(value) = definedExternally
    var file: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$39` {
    @nativeGetter
    operator fun get(key: String): Array<String>?
    @nativeSetter
    operator fun set(key: String, value: Array<String>)
}

external interface WebRequestBody {
    var error: String?
        get() = definedExternally
        set(value) = definedExternally
    var formData: `T$39`?
        get() = definedExternally
        set(value) = definedExternally
    var raw: Array<UploadData>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebAuthChallenger {
    var host: String
    var port: Number
}

external interface ResourceRequest {
    var url: String
    var requestId: String
    var frameId: Number
    var parentFrameId: Number
    var tabId: Number
    var type: String /* "main_frame" | "sub_frame" | "stylesheet" | "script" | "image" | "font" | "object" | "xmlhttprequest" | "ping" | "csp_report" | "media" | "websocket" | "other" */
    var timeStamp: Number
    var initiator: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebRequestDetails : ResourceRequest {
    var method: String
}

external interface WebRequestHeadersDetails : WebRequestDetails {
    var requestHeaders: Array<HttpHeader>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebRequestBodyDetails : WebRequestDetails {
    var requestBody: WebRequestBody
}

external interface WebRequestFullDetails : WebRequestHeadersDetails, WebRequestBodyDetails

external interface WebResponseDetails : ResourceRequest {
    var statusLine: String
    var statusCode: Number
}

external interface WebResponseHeadersDetails : WebResponseDetails {
    var responseHeaders: Array<HttpHeader>?
        get() = definedExternally
        set(value) = definedExternally
    var method: String
}

external interface WebResponseCacheDetails : WebResponseHeadersDetails {
    var ip: String?
        get() = definedExternally
        set(value) = definedExternally
    var fromCache: Boolean
}

external interface WebRedirectionResponseDetails : WebResponseCacheDetails {
    var redirectUrl: String
}

external interface WebAuthenticationChallengeDetails : WebResponseHeadersDetails {
    var scheme: String
    var realm: String?
        get() = definedExternally
        set(value) = definedExternally
    var challenger: WebAuthChallenger
    var isProxy: Boolean
}

external interface WebResponseErrorDetails : WebResponseCacheDetails {
    var error: String
}

external interface WebRequestBodyEvent : Event<(details: WebRequestBodyDetails) -> dynamic> {
    fun addListener(callback: (details: WebRequestBodyDetails) -> Any, filter: RequestFilter = definedExternally, opt_extraInfoSpec: Array<String> = definedExternally)
}

external interface WebRequestHeadersSynchronousEvent : Event<(details: WebRequestHeadersDetails) -> dynamic> {
    fun addListener(callback: (details: WebRequestHeadersDetails) -> Any, filter: RequestFilter = definedExternally, opt_extraInfoSpec: Array<String> = definedExternally)
}

external interface WebRequestHeadersEvent : Event<(details: WebRequestHeadersDetails) -> Unit> {
    fun addListener(callback: (details: WebRequestHeadersDetails) -> Unit, filter: RequestFilter = definedExternally, opt_extraInfoSpec: Array<String> = definedExternally)
}

external interface _WebResponseHeadersEvent<T : WebResponseHeadersDetails> : Event<(details: T) -> Unit> {
    fun addListener(callback: (details: T) -> Unit, filter: RequestFilter = definedExternally, opt_extraInfoSpec: Array<String> = definedExternally)
}

external interface WebResponseHeadersEvent : Event<(details: WebResponseHeadersDetails) -> dynamic> {
    fun addListener(callback: (details: WebResponseHeadersDetails) -> Any, filter: RequestFilter = definedExternally, opt_extraInfoSpec: Array<String> = definedExternally)
}

external interface WebResponseCacheEvent : _WebResponseHeadersEvent<WebResponseCacheDetails>

external interface WebRedirectionResponseEvent : _WebResponseHeadersEvent<WebRedirectionResponseDetails>

external interface WebAuthenticationChallengeEvent : Event<(details: WebAuthenticationChallengeDetails, callback: (response: BlockingResponse) -> Unit) -> Unit> {
    fun addListener(callback: (details: WebAuthenticationChallengeDetails, callback: (response: BlockingResponse) -> Unit) -> Unit, filter: RequestFilter = definedExternally, opt_extraInfoSpec: Array<String> = definedExternally)
}

external interface WebResponseErrorEvent : _WebResponseHeadersEvent<WebResponseErrorDetails>

external var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Number

external fun handlerBehaviorChanged(callback: Function<*> = definedExternally)

external var onBeforeRequest: WebRequestBodyEvent

external var onBeforeSendHeaders: WebRequestHeadersSynchronousEvent

external var onSendHeaders: WebRequestHeadersEvent

external var onHeadersReceived: WebResponseHeadersEvent

external var onAuthRequired: WebAuthenticationChallengeEvent

external var onResponseStarted: WebResponseCacheEvent

external var onBeforeRedirect: WebRedirectionResponseEvent

external var onCompleted: WebResponseCacheEvent

external var onErrorOccurred: WebResponseErrorEvent