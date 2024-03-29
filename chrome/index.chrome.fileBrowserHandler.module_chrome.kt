@file:JsQualifier("chrome.fileBrowserHandler")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.fileBrowserHandler

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

external interface SelectionParams {
    var allowedFileExtensions: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var suggestedName: String
}

external interface SelectionResult {
    var entry: Any?
        get() = definedExternally
        set(value) = definedExternally
    var success: Boolean
}

external interface FileHandlerExecuteEventDetails {
    var tab_id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var entries: Array<Any>
}

external interface FileBrowserHandlerExecuteEvent : Event<(id: String, details: FileHandlerExecuteEventDetails) -> Unit>

external fun selectFile(selectionParams: SelectionParams, callback: (result: SelectionResult) -> Unit)

external var onExecute: FileBrowserHandlerExecuteEvent