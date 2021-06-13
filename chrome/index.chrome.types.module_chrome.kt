@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.types

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

external interface ChromeSettingClearDetails {
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ChromeSettingSetDetails : ChromeSettingClearDetails {
    var value: Any
    override var scope: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ChromeSettingGetDetails {
    var incognito: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

typealias DetailsCallback = (details: ChromeSettingGetResultDetails) -> Unit

external interface ChromeSettingGetResultDetails {
    var levelOfControl: String
    var value: Any
    var incognitoSpecific: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ChromeSettingChangedEvent : Event<DetailsCallback>

external interface ChromeSetting {
    fun set(details: ChromeSettingSetDetails, callback: Function<*> = definedExternally)
    fun get(details: ChromeSettingGetDetails, callback: DetailsCallback = definedExternally)
    fun clear(details: ChromeSettingClearDetails, callback: Function<*> = definedExternally)
    var onChange: ChromeSettingChangedEvent
}