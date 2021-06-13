@file:JsQualifier("chrome.notifications")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.notifications

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

external interface ButtonOptions {
    var title: String
    var iconUrl: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ItemOptions {
    var title: String
    var message: String
}

external interface NotificationOptions {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var iconUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
    var contextMessage: String?
        get() = definedExternally
        set(value) = definedExternally
    var priority: Number?
        get() = definedExternally
        set(value) = definedExternally
    var eventTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var buttons: Array<ButtonOptions>?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<ItemOptions>?
        get() = definedExternally
        set(value) = definedExternally
    var progress: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isClickable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var appIconMaskUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var imageUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var requireInteraction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NotificationClosedEvent : Event<(notificationId: String, byUser: Boolean) -> Unit>

external interface NotificationClickedEvent : Event<(notificationId: String) -> Unit>

external interface NotificationButtonClickedEvent : Event<(notificationId: String, buttonIndex: Number) -> Unit>

external interface NotificationPermissionLevelChangedEvent : Event<(level: String) -> Unit>

external interface NotificationShowSettingsEvent : Event<() -> Unit>

external var onClosed: NotificationClosedEvent

external var onClicked: NotificationClickedEvent

external var onButtonClicked: NotificationButtonClickedEvent

external var onPermissionLevelChanged: NotificationPermissionLevelChangedEvent

external var onShowSettings: NotificationShowSettingsEvent

external fun create(notificationId: String, options: NotificationOptions, callback: (notificationId: String) -> Unit = definedExternally)

external fun create(notificationId: String, options: NotificationOptions)

external fun create(options: NotificationOptions, callback: (notificationId: String) -> Unit = definedExternally)

external fun create(options: NotificationOptions)

external fun update(notificationId: String, options: NotificationOptions, callback: (wasUpdated: Boolean) -> Unit = definedExternally)

external fun clear(notificationId: String, callback: (wasCleared: Boolean) -> Unit = definedExternally)

external fun getAll(callback: (notifications: Any) -> Unit)

external fun getPermissionLevel(callback: (level: String) -> Unit)