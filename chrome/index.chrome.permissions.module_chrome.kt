@file:JsQualifier("chrome.permissions")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.permissions

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

external interface Permissions {
    var permissions: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var origins: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PermissionsRemovedEvent {
    fun addListener(callback: (permissions: Permissions) -> Unit)
}

external interface PermissionsAddedEvent {
    fun addListener(callback: (permissions: Permissions) -> Unit)
}

external fun contains(permissions: Permissions, callback: (result: Boolean) -> Unit)

external fun getAll(callback: (permissions: Permissions) -> Unit)

external fun request(permissions: Permissions, callback: (granted: Boolean) -> Unit = definedExternally)

external fun remove(permissions: Permissions, callback: (removed: Boolean) -> Unit = definedExternally)

external var onRemoved: PermissionsRemovedEvent

external var onAdded: PermissionsAddedEvent