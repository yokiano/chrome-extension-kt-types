@file:JsQualifier("chrome.tabCapture")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.tabCapture

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
import org.w3c.dom.mediacapture.MediaStream

external interface CaptureInfo {
    var tabId: Number
    var status: String
    var fullscreen: Boolean
}

external interface MediaStreamConstraint {
    var mandatory: Any?
    var optional: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CaptureOptions {
    var audio: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var video: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var audioConstraints: MediaStreamConstraint?
        get() = definedExternally
        set(value) = definedExternally
    var videoConstraints: MediaStreamConstraint?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CaptureStatusChangedEvent : Event<(info: CaptureInfo) -> Unit>

external fun capture(options: CaptureOptions, callback: (stream: MediaStream?) -> Unit)

external fun getCapturedTabs(callback: (result: Array<CaptureInfo>) -> Unit)

external var onStatusChanged: CaptureStatusChangedEvent