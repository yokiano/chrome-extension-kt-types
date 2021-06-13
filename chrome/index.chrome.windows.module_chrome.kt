@file:JsQualifier("chrome.windows")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.windows

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
import chrome.tabs.Tab
import chrome.events.Event

external interface Window {
    var tabs: Array<Tab>?
        get() = definedExternally
        set(value) = definedExternally
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var state: String
    var focused: Boolean
    var alwaysOnTop: Boolean
    var incognito: Boolean
    var type: String
    var id: Number
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sessionId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetInfo {
    var populate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var windowTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CreateData {
    var tabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var url: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var focused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var incognito: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var state: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UpdateInfo {
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var drawAttention: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var state: String?
        get() = definedExternally
        set(value) = definedExternally
    var focused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WindowEventFilter {
    var windowTypes: Array<String>
}

external interface WindowIdEvent : Event<(windowId: Number, filters: WindowEventFilter) -> Unit>

external interface WindowReferenceEvent : Event<(window: Window, filters: WindowEventFilter) -> Unit>

external var WINDOW_ID_CURRENT: Number

external var WINDOW_ID_NONE: Number

external fun get(windowId: Number, callback: (window: Window) -> Unit)

external fun get(windowId: Number, getInfo: GetInfo, callback: (window: Window) -> Unit)

external fun getCurrent(callback: (window: Window) -> Unit)

external fun getCurrent(getInfo: GetInfo, callback: (window: Window) -> Unit)

external fun create(callback: (window: Window) -> Unit = definedExternally)

external fun create()

external fun create(createData: CreateData, callback: (window: Window) -> Unit = definedExternally)

external fun create(createData: CreateData)

external fun getAll(callback: (windows: Array<Window>) -> Unit)

external fun getAll(getInfo: GetInfo, callback: (windows: Array<Window>) -> Unit)

external fun update(windowId: Number, updateInfo: UpdateInfo, callback: (window: Window) -> Unit = definedExternally)

external fun remove(windowId: Number, callback: Function<*> = definedExternally)

external fun getLastFocused(callback: (window: Window) -> Unit)

external fun getLastFocused(getInfo: GetInfo, callback: (window: Window) -> Unit)

external var onRemoved: WindowIdEvent

external var onCreated: WindowReferenceEvent

external var onFocusChanged: WindowIdEvent