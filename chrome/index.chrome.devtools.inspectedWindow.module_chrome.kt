@file:JsQualifier("chrome.devtools.inspectedWindow")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.devtools.inspectedWindow

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

external interface Resource {
    var url: String
    fun getContent(callback: (content: String, encoding: String) -> Unit)
    fun setContent(content: String, commit: Boolean, callback: (error: Any) -> Unit = definedExternally)
}

external interface ReloadOptions {
    var userAgent: String?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreCache: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var injectedScript: String?
        get() = definedExternally
        set(value) = definedExternally
    var preprocessorScript: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EvaluationExceptionInfo {
    var isError: Boolean
    var code: String
    var description: String
    var details: Array<Any>
    var isException: Boolean
    var value: String
}

external interface ResourceAddedEvent : Event<(resource: Resource) -> Unit>

external interface ResourceContentCommittedEvent : Event<(resource: Resource, content: String) -> Unit>

external var tabId: Number

external fun reload(reloadOptions: ReloadOptions)

external fun <T> eval(expression: String, callback: (result: T, exceptionInfo: EvaluationExceptionInfo) -> Unit = definedExternally)

external fun <T> eval(expression: String)

external fun <T> eval(expression: String, options: EvalOptions, callback: (result: T, exceptionInfo: EvaluationExceptionInfo) -> Unit = definedExternally)

external fun <T> eval(expression: String, options: EvalOptions)

external fun getResources(callback: (resources: Array<Resource>) -> Unit)

external var onResourceAdded: ResourceAddedEvent

external var onResourceContentCommitted: ResourceContentCommittedEvent

external interface EvalOptions {
    var frameURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var useContentScriptContext: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var contextSecurityOrigin: String?
        get() = definedExternally
        set(value) = definedExternally
}