@file:JsQualifier("chrome.desktopCapture")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.desktopCapture

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
import chrome.tabs.Tab

external fun chooseDesktopMedia(sources: Array<String>, callback: (streamId: String) -> Unit): Number

external fun chooseDesktopMedia(sources: Array<String>, targetTab: Tab, callback: (streamId: String) -> Unit): Number

external fun cancelChooseDesktopMedia(desktopMediaRequestId: Number)