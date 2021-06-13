@file:JsQualifier("chrome.alarms")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.alarms

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

external interface AlarmCreateInfo {
    var delayInMinutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var periodInMinutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var `when`: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Alarm {
    var periodInMinutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scheduledTime: Number
    var name: String
}

external interface AlarmEvent : Event<(alarm: Alarm) -> Unit>

external fun create(alarmInfo: AlarmCreateInfo)

external fun create(name: String, alarmInfo: AlarmCreateInfo)

external fun getAll(callback: (alarms: Array<Alarm>) -> Unit)

external fun clearAll(callback: (wasCleared: Boolean) -> Unit = definedExternally)

external fun clear(name: String = definedExternally, callback: (wasCleared: Boolean) -> Unit = definedExternally)

external fun clear()

external fun clear(name: String = definedExternally)

external fun clear(callback: (wasCleared: Boolean) -> Unit)

external fun get(callback: (alarm: Alarm) -> Unit)

external fun get(name: String, callback: (alarm: Alarm) -> Unit)

external var onAlarm: AlarmEvent