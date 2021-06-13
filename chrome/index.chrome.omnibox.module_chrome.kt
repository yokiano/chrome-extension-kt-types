@file:JsQualifier("chrome.omnibox")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.omnibox

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

external interface SuggestResult {
    var content: String
    var description: String
    var deletable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Suggestion {
    var description: String
}

external interface OmniboxInputEnteredEvent : Event<(text: String, disposition: String /* "currentTab" | "newForegroundTab" | "newBackgroundTab" */) -> Unit>

external interface OmniboxInputChangedEvent : Event<(text: String, suggest: (suggestResults: Array<SuggestResult>) -> Unit) -> Unit>

external interface OmniboxInputStartedEvent : Event<() -> Unit>

external interface OmniboxInputCancelledEvent : Event<() -> Unit>

external interface OmniboxSuggestionDeletedEvent : Event<(text: String) -> Unit>

external fun setDefaultSuggestion(suggestion: Suggestion)

external var onInputEntered: OmniboxInputEnteredEvent

external var onInputChanged: OmniboxInputChangedEvent

external var onInputStarted: OmniboxInputStartedEvent

external var onInputCancelled: OmniboxInputCancelledEvent

external var onDeleteSuggestion: OmniboxSuggestionDeletedEvent