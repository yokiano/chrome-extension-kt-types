@file:JsQualifier("chrome.networking.config")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.networking.config

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

external interface NetworkInfo {
    var Type: String
    var GUID: String?
        get() = definedExternally
        set(value) = definedExternally
    var HexSSID: String?
        get() = definedExternally
        set(value) = definedExternally
    var SSID: String?
        get() = definedExternally
        set(value) = definedExternally
    var BSSID: String?
        get() = definedExternally
        set(value) = definedExternally
    var Security: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CaptivePorttalDetectedEvent : Event<(networkInfo: NetworkInfo) -> Unit>

external fun setNetworkFilter(networks: Array<NetworkInfo>, callback: () -> Unit)

external fun finishAuthentication(GUID: String, result: String, callback: () -> Unit = definedExternally)

external var onCaptivePortalDetected: CaptivePorttalDetectedEvent