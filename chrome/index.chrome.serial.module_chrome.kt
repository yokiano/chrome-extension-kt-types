@file:JsQualifier("chrome.serial")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.serial

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

external object DataBits {
    var SEVEN: String /* "seven" */
    var EIGHT: String /* "eight" */
}

external object ParityBit {
    var NO: String /* "no" */
    var ODD: String /* "odd" */
    var EVEN: String /* "even" */
}

external object StopBits {
    var ONE: String /* "one" */
    var TWO: String /* "two" */
}

external interface DeviceInfo {
    var path: String
    var vendorId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var productId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var displayName: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ConnectionInfo {
    var connectionId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paused: Boolean
    var peristent: Boolean
    var name: String
    var bufferSize: Number
    var receiveTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sendTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bitrate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataBits: Any
    var parityBit: Any
    var stopBits: Any
    var ctsFlowControl: Boolean?
}

external interface ConnectionOptions {
    var peristent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var bufferSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bitrate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataBits: Any
    var parityBit: Any
    var stopBits: Any
    var ctsFlowControl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var receiveTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sendTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun getDevices(callback: (ports: Array<DeviceInfo>) -> Unit)

external fun connect(path: String, options: ConnectionOptions, callback: (connectionInfo: ConnectionInfo) -> Unit)

external fun update(connectionId: Number, options: ConnectionOptions, callback: (result: Boolean) -> Unit)

external fun disconnect(connectionId: Number, callback: (result: Boolean) -> Unit)

external fun setPaused(connectionId: Number, paused: Boolean, callback: () -> Unit)

external fun getInfo(callback: (connectionInfos: Array<ConnectionInfo>) -> Unit)

external fun getConnections(callback: (connectionInfos: Array<ConnectionInfo>) -> Unit)

external fun send(connectionId: Number, data: ArrayBuffer, callback: (sendInfo: Any?) -> Unit)

external fun flush(connectionId: Number, callback: (result: Boolean) -> Unit)

external fun getControlSignals(connectionId: Number, callback: (signals: Any?) -> Unit)

external fun setControlSignals(connectionId: Number, signals: Any?, callback: (result: Boolean) -> Unit)

external fun setBreak(connectionId: Number, callback: (result: Boolean) -> Unit)

external fun clearBreak(connectionId: Number, callback: (result: Boolean) -> Unit)