@file:JsQualifier("chrome.fontSettings")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.fontSettings

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

external interface FontName {
    var displayName: String
    var fontId: String
}

external interface DefaultFontSizeDetails {
    var pixelSize: Number
}

external interface FontDetails {
    var genericFamily: String
    var script: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FullFontDetails {
    var genericFamily: String
    var levelOfControl: String
    var script: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontId: String
}

external interface FontDetailsResult {
    var levelOfControl: String
    var fontId: String
}

external interface FontSizeDetails {
    var pixelSize: Number
    var levelOfControl: String
}

external interface SetFontSizeDetails {
    var pixelSize: Number
}

external interface SetFontDetails : FontDetails {
    var fontId: String
}

external interface DefaultFixedFontSizeChangedEvent : Event<(details: FontSizeDetails) -> Unit>

external interface DefaultFontSizeChangedEvent : Event<(details: FontSizeDetails) -> Unit>

external interface MinimumFontSizeChangedEvent : Event<(details: FontSizeDetails) -> Unit>

external interface FontChangedEvent : Event<(details: FullFontDetails) -> Unit>

external fun setDefaultFontSize(details: DefaultFontSizeDetails, callback: Function<*> = definedExternally)

external fun getFont(details: FontDetails, callback: (details: FontDetailsResult) -> Unit = definedExternally)

external fun getDefaultFontSize(details: Any = definedExternally, callback: (options: FontSizeDetails) -> Unit = definedExternally)

external fun getMinimumFontSize(details: FontSizeDetails = definedExternally, callback: (options: FontSizeDetails) -> Unit = definedExternally)

external fun setMinimumFontSize(details: SetFontSizeDetails, callback: Function<*> = definedExternally)

external fun getDefaultFixedFontSize(details: Any = definedExternally, callback: (details: FontSizeDetails) -> Unit = definedExternally)

external fun clearDefaultFontSize(details: Any = definedExternally, callback: Function<*> = definedExternally)

external fun setDefaultFixedFontSize(details: SetFontSizeDetails, callback: Function<*> = definedExternally)

external fun clearFont(details: FontDetails, callback: Function<*> = definedExternally)

external fun setFont(details: SetFontDetails, callback: Function<*> = definedExternally)

external fun clearMinimumFontSize(details: Any = definedExternally, callback: Function<*> = definedExternally)

external fun getFontList(callback: (results: Array<FontName>) -> Unit)

external fun clearDefaultFixedFontSize(details: Any, callback: Function<*> = definedExternally)

external var onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent

external var onDefaultFontSizeChanged: DefaultFontSizeChangedEvent

external var onMinimumFontSizeChanged: MinimumFontSizeChangedEvent

external var onFontChanged: FontChangedEvent