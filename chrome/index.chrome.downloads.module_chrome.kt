@file:JsQualifier("chrome.downloads")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.downloads

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

external interface HeaderNameValuePair {
    var name: String
    var value: String
}

external interface DownloadOptions {
    var body: String?
        get() = definedExternally
        set(value) = definedExternally
    var saveAs: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var url: String
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Array<HeaderNameValuePair>?
        get() = definedExternally
        set(value) = definedExternally
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
    var conflictAction: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DownloadDelta {
    var id: Number
    var danger: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var url: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var finalUrl: StringDelta
    var totalBytes: DoubleDelta?
        get() = definedExternally
        set(value) = definedExternally
    var filename: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var paused: BooleanDelta?
        get() = definedExternally
        set(value) = definedExternally
    var state: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var mime: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var fileSize: DoubleDelta?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var error: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var endTime: StringDelta?
        get() = definedExternally
        set(value) = definedExternally
    var canResume: BooleanDelta?
        get() = definedExternally
        set(value) = definedExternally
    var exists: BooleanDelta?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BooleanDelta {
    var current: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var previous: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DoubleDelta {
    var current: Number?
        get() = definedExternally
        set(value) = definedExternally
    var previous: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StringDelta {
    var current: String?
        get() = definedExternally
        set(value) = definedExternally
    var previous: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DownloadItem {
    var bytesReceived: Number
    var danger: String
    var url: String
    var finalUrl: String
    var totalBytes: Number
    var filename: String
    var paused: Boolean
    var state: String
    var mime: String
    var fileSize: Number
    var startTime: String
    var error: String?
        get() = definedExternally
        set(value) = definedExternally
    var endTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: Number
    var incognito: Boolean
    var referrer: String
    var estimatedEndTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var canResume: Boolean
    var exists: Boolean
    var byExtensionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var byExtensionName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetFileIconOptions {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DownloadQuery {
    var orderBy: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var urlRegex: String?
        get() = definedExternally
        set(value) = definedExternally
    var endedBefore: String?
        get() = definedExternally
        set(value) = definedExternally
    var totalBytesGreater: Number?
        get() = definedExternally
        set(value) = definedExternally
    var danger: String?
        get() = definedExternally
        set(value) = definedExternally
    var totalBytes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var filenameRegex: String?
        get() = definedExternally
        set(value) = definedExternally
    var query: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var totalBytesLess: Number?
        get() = definedExternally
        set(value) = definedExternally
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bytesReceived: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endedAfter: String?
        get() = definedExternally
        set(value) = definedExternally
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var state: String?
        get() = definedExternally
        set(value) = definedExternally
    var startedAfter: String?
        get() = definedExternally
        set(value) = definedExternally
    var mime: String?
        get() = definedExternally
        set(value) = definedExternally
    var fileSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var startedBefore: String?
        get() = definedExternally
        set(value) = definedExternally
    var limit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var error: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var exists: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DownloadFilenameSuggestion {
    var filename: String
    var conflictAction: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DownloadChangedEvent : Event<(downloadDelta: DownloadDelta) -> Unit>

external interface DownloadCreatedEvent : Event<(downloadItem: DownloadItem) -> Unit>

external interface DownloadErasedEvent : Event<(downloadId: Number) -> Unit>

external interface DownloadDeterminingFilenameEvent : Event<(downloadItem: DownloadItem, suggest: (suggestion: DownloadFilenameSuggestion) -> Unit) -> Unit>

external fun search(query: DownloadQuery, callback: (results: Array<DownloadItem>) -> Unit)

external fun pause(downloadId: Number, callback: () -> Unit = definedExternally)

external fun getFileIcon(downloadId: Number, callback: (iconURL: String) -> Unit)

external fun getFileIcon(downloadId: Number, options: GetFileIconOptions, callback: (iconURL: String) -> Unit)

external fun resume(downloadId: Number, callback: () -> Unit = definedExternally)

external fun cancel(downloadId: Number, callback: () -> Unit = definedExternally)

external fun download(options: DownloadOptions, callback: (downloadId: Number) -> Unit = definedExternally)

external fun open(downloadId: Number)

external fun show(downloadId: Number)

external fun showDefaultFolder()

external fun erase(query: DownloadQuery, callback: (erasedIds: Array<Number>) -> Unit)

external fun removeFile(downloadId: Number, callback: () -> Unit = definedExternally)

external fun acceptDanger(downloadId: Number, callback: () -> Unit)

external fun drag(downloadId: Number)

external fun setShelfEnabled(enabled: Boolean)

external var onChanged: DownloadChangedEvent

external var onCreated: DownloadCreatedEvent

external var onErased: DownloadErasedEvent

external var onDeterminingFilename: DownloadDeterminingFilenameEvent