@file:JsQualifier("chrome.idle")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.idle

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

external interface IdleStateChangedEvent : Event<(newState: String /* "active" | "idle" | "locked" */) -> Unit>

external fun queryState(detectionIntervalInSeconds: Number, callback: (newState: String /* "active" | "idle" | "locked" */) -> Unit)

external fun setDetectionInterval(intervalInSeconds: Number)

external fun getAutoLockDelay(callback: (delay: Number) -> Unit)

external var onStateChanged: IdleStateChangedEvent