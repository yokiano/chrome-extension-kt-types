@file:JsQualifier("chrome.tts")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.tts

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

external interface TtsEvent {
    var charIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var errorMessage: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String
}

external interface TtsVoice {
    var lang: String?
        get() = definedExternally
        set(value) = definedExternally
    var gender: String?
        get() = definedExternally
        set(value) = definedExternally
    var voiceName: String?
        get() = definedExternally
        set(value) = definedExternally
    var extensionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var eventTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var remote: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpeakOptions {
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enqueue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onEvent: ((event: TtsEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var pitch: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lang: String?
        get() = definedExternally
        set(value) = definedExternally
    var voiceName: String?
        get() = definedExternally
        set(value) = definedExternally
    var extensionId: String?
        get() = definedExternally
        set(value) = definedExternally
    var gender: String?
        get() = definedExternally
        set(value) = definedExternally
    var requiredEventTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var desiredEventTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external fun isSpeaking(callback: (speaking: Boolean) -> Unit = definedExternally)

external fun stop()

external fun getVoices(callback: (voices: Array<TtsVoice>) -> Unit = definedExternally)

external fun speak(utterance: String, callback: Function<*> = definedExternally)

external fun speak(utterance: String)

external fun speak(utterance: String, options: SpeakOptions, callback: Function<*> = definedExternally)

external fun speak(utterance: String, options: SpeakOptions)

external fun pause()

external fun resume()