@file:JsQualifier("chrome.bookmarks")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.bookmarks

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

external interface BookmarkTreeNode {
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dateAdded: Number?
        get() = definedExternally
        set(value) = definedExternally
    var title: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var dateGroupModified: Number?
        get() = definedExternally
        set(value) = definedExternally
    var id: String
    var parentId: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<BookmarkTreeNode>?
        get() = definedExternally
        set(value) = definedExternally
    var unmodifiable: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BookmarkRemoveInfo {
    var index: Number
    var parentId: String
    var node: BookmarkTreeNode
}

external interface BookmarkMoveInfo {
    var index: Number
    var oldIndex: Number
    var parentId: String
    var oldParentId: String
}

external interface BookmarkChangeInfo {
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String
}

external interface BookmarkReorderInfo {
    var childIds: Array<String>
}

external interface BookmarkRemovedEvent : Event<(id: String, removeInfo: BookmarkRemoveInfo) -> Unit>

external interface BookmarkImportEndedEvent : Event<() -> Unit>

external interface BookmarkMovedEvent : Event<(id: String, moveInfo: BookmarkMoveInfo) -> Unit>

external interface BookmarkImportBeganEvent : Event<() -> Unit>

external interface BookmarkChangedEvent : Event<(id: String, changeInfo: BookmarkChangeInfo) -> Unit>

external interface BookmarkCreatedEvent : Event<(id: String, bookmark: BookmarkTreeNode) -> Unit>

external interface BookmarkChildrenReordered : Event<(id: String, reorderInfo: BookmarkReorderInfo) -> Unit>

external interface BookmarkSearchQuery {
    var query: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BookmarkCreateArg {
    var parentId: String?
        get() = definedExternally
        set(value) = definedExternally
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BookmarkDestinationArg {
    var parentId: String?
        get() = definedExternally
        set(value) = definedExternally
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BookmarkChangesArg {
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var MAX_WRITE_OPERATIONS_PER_HOUR: Number

external var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Number

external fun search(query: String, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun search(query: BookmarkSearchQuery, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun getTree(callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun getRecent(numberOfItems: Number, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun get(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun get(idList: Array<String>, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun create(bookmark: BookmarkCreateArg, callback: (result: BookmarkTreeNode) -> Unit = definedExternally)

external fun move(id: String, destination: BookmarkDestinationArg, callback: (result: BookmarkTreeNode) -> Unit = definedExternally)

external fun update(id: String, changes: BookmarkChangesArg, callback: (result: BookmarkTreeNode) -> Unit = definedExternally)

external fun remove(id: String, callback: Function<*> = definedExternally)

external fun getChildren(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun getSubTree(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit)

external fun removeTree(id: String, callback: Function<*> = definedExternally)

external var onRemoved: BookmarkRemovedEvent

external var onImportEnded: BookmarkImportEndedEvent

external var onImportBegan: BookmarkImportBeganEvent

external var onChanged: BookmarkChangedEvent

external var onMoved: BookmarkMovedEvent

external var onCreated: BookmarkCreatedEvent

external var onChildrenReordered: BookmarkChildrenReordered