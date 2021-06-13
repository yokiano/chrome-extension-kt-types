@file:JsQualifier("chrome.contentSettings")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.contentSettings

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

external interface ClearDetails {
    var scope: String? /* "regular" | "incognito_session_only" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SetDetails {
    var resourceIdentifier: ResourceIdentifier?
        get() = definedExternally
        set(value) = definedExternally
    var setting: String
    var secondaryPattern: String?
        get() = definedExternally
        set(value) = definedExternally
    var scope: String? /* "regular" | "incognito_session_only" */
        get() = definedExternally
        set(value) = definedExternally
    var primaryPattern: String
}

external interface CookieSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "session_only" */
}

external interface ImagesSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" */
}

external interface JavascriptSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" */
}

external interface LocationSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "ask" */
}

external interface PluginsSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "detect_important_content" */
}

external interface PopupsSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" */
}

external interface NotificationsSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "ask" */
}

external interface FullscreenSetDetails : SetDetails {
    override var setting: String /* "allow" */
}

external interface MouselockSetDetails : SetDetails {
    override var setting: String /* "allow" */
}

external interface MicrophoneSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "ask" */
}

external interface CameraSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "ask" */
}

external interface PpapiBrokerSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "ask" */
}

external interface MultipleAutomaticDownloadsSetDetails : SetDetails {
    override var setting: String /* "allow" | "block" | "ask" */
}

external interface GetDetails {
    var secondaryUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var resourceIdentifier: ResourceIdentifier?
        get() = definedExternally
        set(value) = definedExternally
    var incognito: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var primaryUrl: String
}

external interface ReturnedDetails {
    var setting: Any
}

external interface ContentSetting {
    fun clear(details: ClearDetails, callback: () -> Unit = definedExternally)
    fun set(details: SetDetails, callback: () -> Unit = definedExternally)
    fun getResourceIdentifiers(callback: (resourceIdentifiers: Array<ResourceIdentifier>) -> Unit)
    fun get(details: GetDetails, callback: (details: ReturnedDetails) -> Unit)
}

external interface CookieContentSetting : ContentSetting {
    fun set(details: CookieSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface PopupsContentSetting : ContentSetting {
    fun set(details: PopupsSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface JavascriptContentSetting : ContentSetting {
    fun set(details: JavascriptSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface NotificationsContentSetting : ContentSetting {
    fun set(details: NotificationsSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface PluginsContentSetting : ContentSetting {
    fun set(details: PluginsSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface ImagesContentSetting : ContentSetting {
    fun set(details: ImagesSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface LocationContentSetting : ContentSetting {
    fun set(details: LocationSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface FullscreenContentSetting : ContentSetting {
    fun set(details: FullscreenSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface MouselockContentSetting : ContentSetting {
    fun set(details: MouselockSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface MicrophoneContentSetting : ContentSetting {
    fun set(details: MicrophoneSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface CameraContentSetting : ContentSetting {
    fun set(details: CameraSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface PpapiBrokerContentSetting : ContentSetting {
    fun set(details: PpapiBrokerSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface MultipleAutomaticDownloadsContentSetting : ContentSetting {
    fun set(details: MultipleAutomaticDownloadsSetDetails, callback: () -> Unit = definedExternally)
    override fun set(details: SetDetails, callback: () -> Unit)
}

external interface ResourceIdentifier {
    var id: String
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var cookies: CookieContentSetting

external var popups: PopupsContentSetting

external var javascript: JavascriptContentSetting

external var notifications: NotificationsContentSetting

external var plugins: PluginsContentSetting

external var images: ImagesContentSetting

external var location: LocationContentSetting

external var fullscreen: FullscreenContentSetting

external var mouselock: MouselockContentSetting

external var microphone: MicrophoneContentSetting

external var camera: CameraContentSetting

external var unsandboxedPlugins: PpapiBrokerContentSetting

external var automaticDownloads: MultipleAutomaticDownloadsContentSetting