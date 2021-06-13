@file:JsQualifier("chrome.webNavigation")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.webNavigation

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
import chrome.events.UrlFilter
import chrome.events.Event

external interface GetFrameDetails {
    var processId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tabId: Number
    var frameId: Number
}

external interface GetFrameResultDetails {
    var url: String
    var errorOccurred: Boolean
    var parentFrameId: Number
}

external interface GetAllFrameDetails {
    var tabId: Number
}

external interface GetAllFrameResultDetails : GetFrameResultDetails {
    var processId: Number
    var frameId: Number
}

external interface WebNavigationCallbackDetails {
    var tabId: Number
    var timeStamp: Number
}

external interface WebNavigationUrlCallbackDetails : WebNavigationCallbackDetails {
    var url: String
}

external interface WebNavigationReplacementCallbackDetails : WebNavigationCallbackDetails {
    var replacedTabId: Number
}

external interface WebNavigationFramedCallbackDetails : WebNavigationUrlCallbackDetails {
    var frameId: Number
    var processId: Number
}

external interface WebNavigationFramedErrorCallbackDetails : WebNavigationFramedCallbackDetails {
    var error: String
}

external interface WebNavigationSourceCallbackDetails : WebNavigationUrlCallbackDetails {
    var sourceTabId: Number
    var sourceProcessId: Number
    var sourceFrameId: Number
}

external interface WebNavigationParentedCallbackDetails : WebNavigationFramedCallbackDetails {
    var parentFrameId: Number
}

external interface WebNavigationTransitionCallbackDetails : WebNavigationFramedCallbackDetails {
    var transitionType: String
    var transitionQualifiers: Array<String>
}

external interface WebNavigationEventFilter {
    var url: Array<UrlFilter>
}

external interface WebNavigationEvent<T : WebNavigationCallbackDetails> : Event<(details: T) -> Unit> {
    fun addListener(callback: (details: T) -> Unit, filters: WebNavigationEventFilter = definedExternally)
}

external interface WebNavigationFramedEvent : WebNavigationEvent<WebNavigationFramedCallbackDetails>

external interface WebNavigationFramedErrorEvent : WebNavigationEvent<WebNavigationFramedErrorCallbackDetails>

external interface WebNavigationSourceEvent : WebNavigationEvent<WebNavigationSourceCallbackDetails>

external interface WebNavigationParentedEvent : WebNavigationEvent<WebNavigationParentedCallbackDetails>

external interface WebNavigationTransitionalEvent : WebNavigationEvent<WebNavigationTransitionCallbackDetails>

external interface WebNavigationReplacementEvent : WebNavigationEvent<WebNavigationReplacementCallbackDetails>

external fun getFrame(details: GetFrameDetails, callback: (details: GetFrameResultDetails?) -> Unit)

external fun getAllFrames(details: GetAllFrameDetails, callback: (details: Array<GetAllFrameResultDetails>?) -> Unit)

external var onReferenceFragmentUpdated: WebNavigationTransitionalEvent

external var onCompleted: WebNavigationFramedEvent

external var onHistoryStateUpdated: WebNavigationTransitionalEvent

external var onCreatedNavigationTarget: WebNavigationSourceEvent

external var onTabReplaced: WebNavigationReplacementEvent

external var onBeforeNavigate: WebNavigationParentedEvent

external var onCommitted: WebNavigationTransitionalEvent

external var onDOMContentLoaded: WebNavigationFramedEvent

external var onErrorOccurred: WebNavigationFramedErrorEvent