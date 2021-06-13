@file:JsQualifier("chrome.history")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.history

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

external interface VisitItem {
    var transition: String
    var visitTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visitId: String
    var referringVisitId: String
    var id: String
}

external interface HistoryItem {
    var typedCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastVisitTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visitCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var id: String
}

external interface HistoryQuery {
    var text: String
    var maxResults: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endTime: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Url {
    var url: String
}

external interface Range {
    var endTime: Number
    var startTime: Number
}

external interface RemovedResult {
    var allHistory: Boolean
    var urls: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HistoryVisitedEvent : Event<(result: HistoryItem) -> Unit>

external interface HistoryVisitRemovedEvent : Event<(removed: RemovedResult) -> Unit>

external fun search(query: HistoryQuery, callback: (results: Array<HistoryItem>) -> Unit)

external fun addUrl(details: Url, callback: () -> Unit = definedExternally)

external fun deleteRange(range: Range, callback: () -> Unit)

external fun deleteAll(callback: () -> Unit)

external fun getVisits(details: Url, callback: (results: Array<VisitItem>) -> Unit)

external fun deleteUrl(details: Url, callback: () -> Unit = definedExternally)

external var onVisited: HistoryVisitedEvent

external var onVisitRemoved: HistoryVisitRemovedEvent