@file:JsQualifier("chrome.fileSystemProvider")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.fileSystemProvider

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

external interface OpenedFileInfo {
    var openRequestId: Number
    var filePath: String
    var mode: String
}

external interface FileWatchersInfo {
    var entryPath: String
    var recursive: Boolean
    var lastTag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EntryMetadata {
    var isDirectory: Boolean
    var name: String
    var size: Number
    var modificationTime: Date
    var mimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var thumbnail: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FileSystemInfo {
    var fileSystemId: String
    var displayName: String
    var writable: Boolean
    var openedFilesLimit: Number
    var openedFiles: Array<OpenedFileInfo>
    var supportsNotifyTag: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var watchers: Array<FileWatchersInfo>
}

external interface GetActionsRequestedOptions {
    var fileSystemId: String
    var requestId: Number
    var entryPath: String
}

external interface Action {
    var id: String
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecuteActionRequestedOptions {
    var fileSystemId: String
    var requestId: Number
    var entryPath: String
    var actionId: String
}

external interface MountOptions {
    var fileSystemId: String
    var displayName: String
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var openedFilesLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var supportsNotifyTag: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UnmountOptions {
    var fileSystemId: String
}

external interface NotificationChange {
    var entryPath: String
    var changeType: String
}

external interface NotificationOptions {
    var fileSystemId: String
    var observedPath: String
    var recursive: Boolean
    var changeType: String
    var changes: Array<NotificationChange>?
        get() = definedExternally
        set(value) = definedExternally
    var tag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RequestedEventOptions {
    var fileSystemId: String
    var requestId: Number
}

external interface EntryPathRequestedEventOptions : RequestedEventOptions {
    var entryPath: String
}

external interface MetadataRequestedEventOptions : EntryPathRequestedEventOptions {
    var thumbnail: Boolean
}

external interface DirectoryPathRequestedEventOptions : RequestedEventOptions {
    var directoryPath: String
}

external interface FilePathRequestedEventOptions : RequestedEventOptions {
    var filePath: String
}

external interface OpenFileRequestedEventOptions : FilePathRequestedEventOptions {
    var mode: String
}

external interface OpenedFileRequestedEventOptions : RequestedEventOptions {
    var openRequestId: Number
}

external interface OpenedFileOffsetRequestedEventOptions : OpenedFileRequestedEventOptions {
    var offset: Number
    var length: Number
}

external interface DirectoryPathRecursiveRequestedEventOptions : DirectoryPathRequestedEventOptions {
    var recursive: Boolean
}

external interface EntryPathRecursiveRequestedEventOptions : EntryPathRequestedEventOptions {
    var recursive: Boolean
}

external interface SourceTargetPathRequestedEventOptions : RequestedEventOptions {
    var sourcePath: String
    var targetPath: String
}

external interface FilePathLengthRequestedEventOptions : FilePathRequestedEventOptions {
    var length: Number
}

external interface OpenedFileIoRequestedEventOptions : OpenedFileRequestedEventOptions {
    var offset: Number
    var data: ArrayBuffer
}

external interface OperationRequestedEventOptions : RequestedEventOptions {
    var operationRequestId: Number
}

external interface RequestedEvent : Event<(options: RequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface MetadataRequestedEvent : Event<(options: MetadataRequestedEventOptions, successCallback: (metadata: EntryMetadata) -> Unit, errorCallback: (error: String) -> Unit) -> Unit>

external interface DirectoryPathRequestedEvent : Event<(options: DirectoryPathRequestedEventOptions, successCallback: (entries: Array<EntryMetadata>, hasMore: Boolean) -> Unit, errorCallback: (error: String) -> Unit) -> Unit>

external interface OpenFileRequestedEvent : Event<(options: OpenFileRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface OpenedFileRequestedEvent : Event<(options: OpenedFileRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface OpenedFileOffsetRequestedEvent : Event<(options: OpenedFileOffsetRequestedEventOptions, successCallback: (data: ArrayBuffer, hasMore: Boolean) -> Unit, errorCallback: (error: String) -> Unit) -> Unit>

external interface DirectoryPathRecursiveRequestedEvent : Event<(options: DirectoryPathRecursiveRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface EntryPathRecursiveRequestedEvent : Event<(options: EntryPathRecursiveRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface FilePathRequestedEvent : Event<(options: FilePathRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface SourceTargetPathRequestedEvent : Event<(options: SourceTargetPathRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface FilePathLengthRequestedEvent : Event<(options: FilePathLengthRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface OpenedFileIoRequestedEvent : Event<(options: OpenedFileIoRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface OperationRequestedEvent : Event<(options: OperationRequestedEventOptions, successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external interface OptionlessRequestedEvent : Event<(successCallback: Function<*>, errorCallback: (error: String) -> Unit) -> Unit>

external fun mount(options: MountOptions, callback: () -> Unit = definedExternally)

external fun unmount(options: UnmountOptions, callback: () -> Unit = definedExternally)

external fun getAll(callback: (fileSystems: Array<FileSystemInfo>) -> Unit)

external fun get(fileSystemId: String, callback: (fileSystem: FileSystemInfo) -> Unit)

external fun notify(options: NotificationOptions, callback: () -> Unit)

external var onUnmountRequested: RequestedEvent

external var onGetMetadataRequested: MetadataRequestedEvent

external var onReadDirectoryRequested: DirectoryPathRequestedEvent

external var onOpenFileRequested: OpenFileRequestedEvent

external var onCloseFileRequested: OpenedFileRequestedEvent

external var onReadFileRequested: OpenedFileOffsetRequestedEvent

external var onCreateDirectoryRequested: DirectoryPathRecursiveRequestedEvent

external var onDeleteEntryRequested: EntryPathRecursiveRequestedEvent

external var onCreateFileRequested: FilePathRequestedEvent

external var onCopyEntryRequested: SourceTargetPathRequestedEvent

external var onMoveEntryRequested: SourceTargetPathRequestedEvent

external var onTruncateRequested: FilePathLengthRequestedEvent

external var onWriteFileRequested: OpenedFileIoRequestedEvent

external var onAbortRequested: OperationRequestedEvent

external var onConfigureRequested: RequestedEvent

external var onMountRequested: OptionlessRequestedEvent

external var onAddWatcherRequested: EntryPathRecursiveRequestedEvent

external var onRemoveWatcherRequested: EntryPathRecursiveRequestedEvent