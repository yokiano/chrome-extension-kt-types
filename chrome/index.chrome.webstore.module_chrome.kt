@file:JsQualifier("chrome.webstore")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.webstore

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

external fun install(url: String, successCallback: Function<*> = definedExternally, failureCallback: (error: String, errorCode: String) -> Unit = definedExternally)

external fun install(url: String)

external fun install(url: String, successCallback: Function<*> = definedExternally)

external fun install(successCallback: Function<*>, failureCallback: (error: String, errorCode: String) -> Unit = definedExternally)

external fun install(successCallback: Function<*>)

external fun install(failureCallback: (error: String, errorCode: String) -> Unit = definedExternally)

external fun install()

external interface InstallationStageEvent : Event<(stage: String) -> Unit>

external interface DownloadProgressEvent : Event<(percentDownloaded: Number) -> Unit>

external var onInstallStageChanged: InstallationStageEvent

external var onDownloadProgress: DownloadProgressEvent