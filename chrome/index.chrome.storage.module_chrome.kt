@file:JsQualifier("chrome.storage")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.storage

import chrome.events.Event
import kotlin.js.Json

external interface StorageArea {
    fun getBytesInUse(callback: (bytesInUse: Number) -> Unit)
    fun getBytesInUse(keys: String?, callback: (bytesInUse: Number) -> Unit)
    fun getBytesInUse(keys: Array<String>?, callback: (bytesInUse: Number) -> Unit)
    fun clear(callback: () -> Unit = definedExternally)
    fun set(items: Any, callback: () -> Unit = definedExternally)
    fun remove(keys: String, callback: () -> Unit = definedExternally)
    fun remove(keys: String)
    fun remove(keys: Array<String>, callback: () -> Unit = definedExternally)
    fun remove(keys: Array<String>)
    fun get(callback: (items: Json) -> Unit)
    fun get(keys: String?, callback: (items: Json) -> Unit)
    fun get(keys: Array<String>?, callback: (items: Json) -> Unit)
    fun get(keys: Any?, callback: (items: Json) -> Unit)
}

external interface StorageChange {
    var newValue: Any?
        get() = definedExternally
        set(value) = definedExternally
    var oldValue: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LocalStorageArea : StorageArea {
    var QUOTA_BYTES: Number
}

external interface SyncStorageArea : StorageArea {
    var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Number
    var QUOTA_BYTES: Number
    var QUOTA_BYTES_PER_ITEM: Number
    var MAX_ITEMS: Number
    var MAX_WRITE_OPERATIONS_PER_HOUR: Number
    var MAX_WRITE_OPERATIONS_PER_MINUTE: Number
}

external interface `T$37` {
    @nativeGetter
    operator fun get(key: String): StorageChange?
    @nativeSetter
    operator fun set(key: String, value: StorageChange)
}

external interface StorageChangedEvent : Event<(changes: `T$37`, areaName: Nothing?) -> Unit>

external var local: LocalStorageArea

external var sync: SyncStorageArea

external var managed: StorageArea

external var onChanged: StorageChangedEvent