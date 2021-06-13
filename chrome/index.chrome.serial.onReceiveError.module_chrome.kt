@file:JsQualifier("chrome.serial.onReceiveError")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.serial.onReceiveError

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

external object OnReceiveErrorEnum {
    var disconnected: String /* "disconnected" */
    var timeout: String /* "timeout" */
    var device_lost: String /* "device_lost" */
    var `break`: String /* "break" */
    var frame_error: String /* "frame_error" */
    var overrun: String /* "overrun" */
    var buffer_overflow: String /* "buffer_overflow" */
    var parity_error: String /* "parity_error" */
    var system_error: String /* "system_error" */
}

external interface OnReceiveErrorInfo {
    var connectionId: Number
    var error: ArrayBuffer
}

external fun addListener(callback: (info: OnReceiveErrorInfo) -> Unit)