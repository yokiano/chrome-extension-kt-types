@file:JsQualifier("chrome.socket")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.socket

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

external interface CreateInfo {
    var socketId: Number
}

external interface AcceptInfo {
    var resultCode: Number
    var socketId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReadInfo {
    var resultCode: Number
    var data: ArrayBuffer
}

external interface WriteInfo {
    var bytesWritten: Number
}

external interface RecvFromInfo {
    var resultCode: Number
    var data: ArrayBuffer
    var port: Number
    var address: String
}

external interface SocketInfo {
    var socketType: String
    var localPort: Number?
        get() = definedExternally
        set(value) = definedExternally
    var peerAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var peerPort: Number?
        get() = definedExternally
        set(value) = definedExternally
    var localAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var connected: Boolean
}

external interface NetworkInterface {
    var name: String
    var address: String
}

external fun create(type: String, options: Any = definedExternally, callback: (createInfo: CreateInfo) -> Unit = definedExternally)

external fun destroy(socketId: Number)

external fun connect(socketId: Number, hostname: String, port: Number, callback: (result: Number) -> Unit)

external fun bind(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit)

external fun disconnect(socketId: Number)

external fun read(socketId: Number, bufferSize: Number = definedExternally, callback: (readInfo: ReadInfo) -> Unit = definedExternally)

external fun write(socketId: Number, data: ArrayBuffer, callback: (writeInfo: WriteInfo) -> Unit = definedExternally)

external fun recvFrom(socketId: Number, bufferSize: Number = definedExternally, callback: (recvFromInfo: RecvFromInfo) -> Unit = definedExternally)

external fun sendTo(socketId: Number, data: ArrayBuffer, address: String, port: Number, callback: (writeInfo: WriteInfo) -> Unit = definedExternally)

external fun listen(socketId: Number, address: String, port: Number, backlog: Number = definedExternally, callback: (result: Number) -> Unit = definedExternally)

external fun accept(socketId: Number, callback: (acceptInfo: AcceptInfo) -> Unit = definedExternally)

external fun setKeepAlive(socketId: Number, enable: Boolean, delay: Number = definedExternally, callback: (result: Boolean) -> Unit = definedExternally)

external fun setNoDelay(socketId: Number, noDelay: Boolean, callback: (result: Boolean) -> Unit = definedExternally)

external fun getInfo(socketId: Number, callback: (result: SocketInfo) -> Unit)

external fun getNetworkList(callback: (result: Array<NetworkInterface>) -> Unit)