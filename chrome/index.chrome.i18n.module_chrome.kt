@file:JsQualifier("chrome.i18n")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.i18n

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

external interface DetectedLanguage {
    var language: String
    var percentage: Number
}

external interface LanguageDetectionResult {
    var isReliable: Boolean
    var languages: Array<DetectedLanguage>
}

external fun getAcceptLanguages(callback: (languages: Array<String>) -> Unit)

external fun getMessage(messageName: String, substitutions: Any = definedExternally): String

external fun getUILanguage(): String

external fun detectLanguage(text: String, callback: (result: LanguageDetectionResult) -> Unit)