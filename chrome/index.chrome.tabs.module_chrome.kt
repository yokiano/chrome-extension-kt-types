@file:JsQualifier("chrome.tabs")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.tabs

import chrome.events.Event
import chrome.runtime.Port
import chrome.windows.Window

external interface MutedInfo {
    var muted: Boolean
    var reason: String?
        get() = definedExternally
        set(value) = definedExternally
    var extensionId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Tab {
    var status: String?
        get() = definedExternally
        set(value) = definedExternally
    var index: Number
    var openerTabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var pendingUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var pinned: Boolean
    var highlighted: Boolean
    var windowId: Number
    var active: Boolean
    var favIconUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var incognito: Boolean
    var selected: Boolean
    var audible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var discarded: Boolean
    var autoDiscardable: Boolean
    var mutedInfo: MutedInfo?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sessionId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ZoomSettings {
    var mode: String?
        get() = definedExternally
        set(value) = definedExternally
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultZoomFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InjectDetails {
    var allFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var code: String?
        get() = definedExternally
        set(value) = definedExternally
    var runAt: String?
        get() = definedExternally
        set(value) = definedExternally
    var file: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var matchAboutBlank: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cssOrigin: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CreateProperties {
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var openerTabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var pinned: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var windowId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MoveProperties {
    var index: Number
    var windowId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UpdateProperties {
    var pinned: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var openerTabId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var highlighted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var muted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDiscardable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CaptureVisibleTabOptions {
    var quality: Number?
        get() = definedExternally
        set(value) = definedExternally
    var format: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReloadProperties {
    var bypassCache: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ConnectInfo {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessageSendOptions {
    var frameId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HighlightInfo {
    var tabs: dynamic /* Number | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
    var windowId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueryInfo {
    var status: String? /* "loading" | "complete" */
        get() = definedExternally
        set(value) = definedExternally
    var lastFocusedWindow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var windowId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var windowType: String? /* "normal" | "popup" | "panel" | "app" | "devtools" */
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var currentWindow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var highlighted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var discarded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDiscardable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pinned: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var audible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var muted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TabHighlightInfo {
    var windowId: Number
    var tabIds: Array<Number>
}

external interface TabRemoveInfo {
    var windowId: Number
    var isWindowClosing: Boolean
}

external interface TabAttachInfo {
    var newPosition: Number
    var newWindowId: Number
}

external interface TabChangeInfo {
    var status: String?
        get() = definedExternally
        set(value) = definedExternally
    var pinned: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var audible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var discarded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoDiscardable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mutedInfo: MutedInfo?
        get() = definedExternally
        set(value) = definedExternally
    var favIconUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TabMoveInfo {
    var toIndex: Number
    var windowId: Number
    var fromIndex: Number
}

external interface TabDetachInfo {
    var oldWindowId: Number
    var oldPosition: Number
}

external interface TabActiveInfo {
    var tabId: Number
    var windowId: Number
}

external interface TabWindowInfo {
    var windowId: Number
}

external interface ZoomChangeInfo {
    var tabId: Number
    var oldZoomFactor: Number
    var newZoomFactor: Number
    var zoomSettings: ZoomSettings
}

external interface TabHighlightedEvent : Event<(highlightInfo: TabHighlightInfo) -> Unit>

external interface TabRemovedEvent : Event<(tabId: Number, removeInfo: TabRemoveInfo) -> Unit>

external interface TabUpdatedEvent : Event<(tabId: Number, changeInfo: TabChangeInfo, tab: Tab) -> Unit>

external interface TabAttachedEvent : Event<(tabId: Number, attachInfo: TabAttachInfo) -> Unit>

external interface TabMovedEvent : Event<(tabId: Number, moveInfo: TabMoveInfo) -> Unit>

external interface TabDetachedEvent : Event<(tabId: Number, detachInfo: TabDetachInfo) -> Unit>

external interface TabCreatedEvent : Event<(tab: Tab) -> Unit>

external interface TabActivatedEvent : Event<(activeInfo: TabActiveInfo) -> Unit>

external interface TabReplacedEvent : Event<(addedTabId: Number, removedTabId: Number) -> Unit>

external interface TabSelectedEvent : Event<(tabId: Number, selectInfo: TabWindowInfo) -> Unit>

external interface TabZoomChangeEvent : Event<(ZoomChangeInfo: ZoomChangeInfo) -> Unit>

external fun executeScript(details: InjectDetails, callback: (result: Array<Any>) -> Unit = definedExternally)

external fun executeScript(details: InjectDetails)

external fun executeScript(tabId: Number, details: InjectDetails, callback: (result: Array<Any>) -> Unit = definedExternally)

external fun executeScript(tabId: Number, details: InjectDetails)

external fun get(tabId: Number, callback: (tab: Tab) -> Unit)

external fun getAllInWindow(callback: (tab: Tab) -> Unit)

external fun getAllInWindow(windowId: Number, callback: (tab: Tab) -> Unit)

external fun getCurrent(callback: (tab: Tab) -> Unit)

external fun getSelected(callback: (tab: Tab) -> Unit)

external fun getSelected(windowId: Number, callback: (tab: Tab) -> Unit)

external fun create(createProperties: CreateProperties, callback: (tab: Tab) -> Unit = definedExternally)

external fun move(tabId: Number, moveProperties: MoveProperties, callback: (tab: Tab) -> Unit = definedExternally)

external fun move(tabId: Number, moveProperties: MoveProperties)

external fun move(tabIds: Array<Number>, moveProperties: MoveProperties, callback: (tabs: Array<Tab>) -> Unit = definedExternally)

external fun move(tabIds: Array<Number>, moveProperties: MoveProperties)

external fun update(updateProperties: UpdateProperties, callback: (tab: Tab) -> Unit = definedExternally)

external fun update(updateProperties: UpdateProperties)

external fun update(tabId: Number, updateProperties: UpdateProperties, callback: (tab: Tab) -> Unit = definedExternally)

external fun update(tabId: Number, updateProperties: UpdateProperties)

external fun remove(tabId: Number, callback: Function<*> = definedExternally)

external fun remove(tabId: Number)

external fun remove(tabIds: Array<Number>, callback: Function<*> = definedExternally)

external fun remove(tabIds: Array<Number>)

external fun captureVisibleTab(callback: (dataUrl: String) -> Unit)

external fun captureVisibleTab(windowId: Number, callback: (dataUrl: String) -> Unit)

external fun captureVisibleTab(options: CaptureVisibleTabOptions, callback: (dataUrl: String) -> Unit)

external fun captureVisibleTab(windowId: Number, options: CaptureVisibleTabOptions, callback: (dataUrl: String) -> Unit)

external fun reload(tabId: Number, reloadProperties: ReloadProperties = definedExternally, callback: () -> Unit = definedExternally)

external fun reload(tabId: Number)

external fun reload(tabId: Number, reloadProperties: ReloadProperties = definedExternally)

external fun reload(reloadProperties: ReloadProperties, callback: () -> Unit = definedExternally)

external fun reload(reloadProperties: ReloadProperties)

external fun reload(callback: () -> Unit = definedExternally)

external fun reload()

external fun duplicate(tabId: Number, callback: (tab: Tab) -> Unit = definedExternally)

external fun sendMessage(tabId: Number, message: Any, responseCallback: (response: Any) -> Unit = definedExternally)

external fun sendMessage(tabId: Number, message: Any)

external fun sendMessage(tabId: Number, message: Any, options: MessageSendOptions, responseCallback: (response: Any) -> Unit = definedExternally)

external fun sendMessage(tabId: Number, message: Any, options: MessageSendOptions)

external fun sendRequest(tabId: Number, request: Any, responseCallback: (response: Any) -> Unit = definedExternally)

external fun connect(tabId: Number, connectInfo: ConnectInfo = definedExternally): Port

external fun insertCSS(details: InjectDetails, callback: Function<*> = definedExternally)

external fun insertCSS(details: InjectDetails)

external fun insertCSS(tabId: Number, details: InjectDetails, callback: Function<*> = definedExternally)

external fun insertCSS(tabId: Number, details: InjectDetails)

external fun highlight(highlightInfo: HighlightInfo, callback: (window: Window) -> Unit = definedExternally)

external fun query(queryInfo: QueryInfo, callback: (result: Array<Tab>) -> Unit)

external fun detectLanguage(callback: (language: String) -> Unit)

external fun detectLanguage(tabId: Number, callback: (language: String) -> Unit)

external fun setZoom(zoomFactor: Number, callback: () -> Unit = definedExternally)

external fun setZoom(zoomFactor: Number)

external fun setZoom(tabId: Number, zoomFactor: Number, callback: () -> Unit = definedExternally)

external fun setZoom(tabId: Number, zoomFactor: Number)

external fun getZoom(callback: (zoomFactor: Number) -> Unit)

external fun getZoom(tabId: Number, callback: (zoomFactor: Number) -> Unit)

external fun setZoomSettings(zoomSettings: ZoomSettings, callback: () -> Unit = definedExternally)

external fun setZoomSettings(zoomSettings: ZoomSettings)

external fun setZoomSettings(tabId: Number, zoomSettings: ZoomSettings, callback: () -> Unit = definedExternally)

external fun setZoomSettings(tabId: Number, zoomSettings: ZoomSettings)

external fun getZoomSettings(callback: (zoomSettings: ZoomSettings) -> Unit)

external fun getZoomSettings(tabId: Number, callback: (zoomSettings: ZoomSettings) -> Unit)

external fun discard(tabId: Number = definedExternally, callback: (tab: Tab) -> Unit = definedExternally)

external fun goForward(callback: () -> Unit = definedExternally)

external fun goForward()

external fun goForward(tabId: Number, callback: () -> Unit = definedExternally)

external fun goForward(tabId: Number)

external fun goBack(callback: () -> Unit = definedExternally)

external fun goBack()

external fun goBack(tabId: Number, callback: () -> Unit = definedExternally)

external fun goBack(tabId: Number)

external var onHighlighted: TabHighlightedEvent

external var onRemoved: TabRemovedEvent

external var onUpdated: TabUpdatedEvent

external var onAttached: TabAttachedEvent

external var onMoved: TabMovedEvent

external var onDetached: TabDetachedEvent

external var onCreated: TabCreatedEvent

external var onActivated: TabActivatedEvent

external var onReplaced: TabReplacedEvent

external var onSelectionChanged: TabSelectedEvent

external var onActiveChanged: TabSelectedEvent

external var onHighlightChanged: TabHighlightedEvent

external var onZoomChange: TabZoomChangeEvent

external var TAB_ID_NONE: String /* "-1" */