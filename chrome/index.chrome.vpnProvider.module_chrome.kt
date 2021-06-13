@file:JsQualifier("chrome.vpnProvider")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.vpnProvider

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

external interface VpnSessionParameters {
    var address: String
    var broadcastAddress: String?
        get() = definedExternally
        set(value) = definedExternally
    var mtu: String?
        get() = definedExternally
        set(value) = definedExternally
    var exclusionList: Array<String>
    var inclusionList: Array<String>
    var domainSearch: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var dnsServer: Array<String>
}

external interface VpnPlatformMessageEvent : Event<(id: String, message: String, error: String) -> Unit>

external interface VpnPacketReceptionEvent : Event<(data: ArrayBuffer) -> Unit>

external interface VpnConfigRemovalEvent : Event<(id: String) -> Unit>

external interface VpnConfigCreationEvent : Event<(id: String, name: String, data: Any) -> Unit>

external interface VpnUiEvent : Event<(event: String, id: String) -> Unit>

external fun createConfig(name: String, callback: (id: String) -> Unit)

external fun destroyConfig(id: String, callback: Function<*> = definedExternally)

external fun setParameters(parameters: VpnSessionParameters, callback: Function<*>)

external fun sendPacket(data: ArrayBuffer, callback: Function<*> = definedExternally)

external fun notifyConnectionStateChanged(state: String, callback: Function<*> = definedExternally)

external var onPlatformMessage: VpnPlatformMessageEvent

external var onPacketReceived: VpnPacketReceptionEvent

external var onConfigRemoved: VpnConfigRemovalEvent

external var onConfigCreated: VpnConfigCreationEvent

external var onUIEvent: VpnUiEvent