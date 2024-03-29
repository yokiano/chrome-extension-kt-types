@file:JsQualifier("chrome.declarativeContent")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.declarativeContent

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

external interface PageStateUrlDetails {
    var hostContains: String?
        get() = definedExternally
        set(value) = definedExternally
    var hostEquals: String?
        get() = definedExternally
        set(value) = definedExternally
    var hostPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var hostSuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var pathContains: String?
        get() = definedExternally
        set(value) = definedExternally
    var pathEquals: String?
        get() = definedExternally
        set(value) = definedExternally
    var pathPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var pathSuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var queryContains: String?
        get() = definedExternally
        set(value) = definedExternally
    var queryEquals: String?
        get() = definedExternally
        set(value) = definedExternally
    var queryPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var querySuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var urlContains: String?
        get() = definedExternally
        set(value) = definedExternally
    var urlEquals: String?
        get() = definedExternally
        set(value) = definedExternally
    var urlMatches: String?
        get() = definedExternally
        set(value) = definedExternally
    var originAndPathMatches: String?
        get() = definedExternally
        set(value) = definedExternally
    var urlPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var urlSuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var schemes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var ports: Array<dynamic /* Number | Array<Number> */>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PageStateMatcherProperties {
    open var pageUrl: PageStateUrlDetails
    open var css: Array<String>
    open var isBookmarked: Boolean
}

external open class PageStateMatcher(options: PageStateMatcherProperties)

external open class ShowPageAction

external interface `T$1` {
    @nativeGetter
    operator fun get(size: String): ImageData?
    @nativeSetter
    operator fun set(size: String, value: ImageData)
}

external interface `T$2` {
    var imageData: dynamic /* ImageData? | `T$1`? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class SetIcon(options: `T$2` = definedExternally)

external interface PageChangedEvent : Event<() -> Unit>

external var onPageChanged: PageChangedEvent