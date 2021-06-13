@file:JsQualifier("chrome.accessibilityFeatures")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.accessibilityFeatures

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
import chrome.types.ChromeSetting

external var spokenFeedback: ChromeSetting

external var largeCursor: ChromeSetting

external var stickyKeys: ChromeSetting

external var highContrast: ChromeSetting

external var screenMagnifier: ChromeSetting

external var autoclick: ChromeSetting

external var virtualKeyboard: ChromeSetting

external var caretHighlight: ChromeSetting

external var cursorHighlight: ChromeSetting

external var focusHighlight: ChromeSetting

external var selectToSpeak: ChromeSetting

external var switchAccess: ChromeSetting

external var animationPolicy: ChromeSetting