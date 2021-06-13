@file:JsQualifier("chrome.system.display")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.system.display

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

external object DisplayPosition {
    var TOP: String /* "top" */
    var RIGHT: String /* "right" */
    var BOTTOM: String /* "bottom" */
    var LEFT: String /* "left" */
}

external object MirrorMode {
    var OFF: String /* "off" */
    var NORMAL: String /* "normal" */
    var MIXED: String /* "mixed" */
}

external interface Bounds {
    var left: Number
    var top: Number
    var width: Number
    var height: Number
}

external interface Insets {
    var left: Number
    var top: Number
    var right: Number
    var bottom: Number
}

external interface Point {
    var x: Number
    var y: Number
}

external interface TouchCalibrationPair {
    var displayPoint: Point
    var touchPoint: Point
}

external interface DisplayMode {
    var width: Number
    var height: Number
    var widthInNativePixels: Number
    var heightInNativePixels: Number
    var uiScale: Number
    var deviceScaleFactor: Number
    var refreshRate: Number
    var isNative: Boolean
    var isSelected: Boolean
}

external interface DisplayLayout {
    var id: String
    var parentId: String
    var position: Any
    var offset: Number
}

external interface TouchCalibrationPairs {
    var pair1: TouchCalibrationPair
    var pair2: TouchCalibrationPair
    var pair3: TouchCalibrationPair
    var pair4: TouchCalibrationPair
}

external interface DisplayPropertiesInfo {
    var isUnified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mirroringSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var isPrimary: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var overscan: Insets?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number? /* 0 | 90 | 180 | 270 */
        get() = definedExternally
        set(value) = definedExternally
    var boundsOriginX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var boundsOriginY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var displayMode: DisplayMode?
        get() = definedExternally
        set(value) = definedExternally
    var displayZoomFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DisplayInfoFlags {
    var singleUnified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$38` {
    var manufacturerId: String
    var productId: String
    var yearOfManufacture: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DisplayInfo {
    var id: String
    var name: String
    var edid: `T$38`?
        get() = definedExternally
        set(value) = definedExternally
    var mirroringSourceId: String
    var mirroringDestinationIds: Array<String>
    var isPrimary: Boolean
    var isInternal: Boolean
    var isEnabled: Boolean
    var dpiX: Number
    var dpiY: Number
    var rotation: Number
    var bounds: Bounds
    var overscan: Insets
    var workArea: Bounds
    var modes: Array<DisplayMode>
    var hasTouchSupport: Boolean
    var availableDisplayZoomFactors: Array<Number>
    var displayZoomFactor: Number
}

external interface MirrorModeInfo {
    var mode: String? /* "off" | "normal" | "mixed" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MirrorModeInfoMixed : MirrorModeInfo {
    var mirroringSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var mirroringDestinationIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external fun getInfo(callback: (info: Array<DisplayInfo>) -> Unit)

external fun getInfo(flags: DisplayInfoFlags, callback: (info: Array<DisplayInfo>) -> Unit)

external fun getDisplayLayout(callback: (layouts: Array<DisplayLayout>) -> Unit)

external fun setDisplayProperties(id: String, info: DisplayPropertiesInfo, callback: () -> Unit = definedExternally)

external fun setDisplayLayout(layouts: Array<DisplayLayout>, callback: () -> Unit = definedExternally)

external fun enableUnifiedDesktop(enabled: Boolean)

external fun overscanCalibrationStart(id: String)

external fun overscanCalibrationAdjust(id: String, delta: Insets)

external fun overscanCalibrationReset(id: String)

external fun overscanCalibrationComplete(id: String)

external fun showNativeTouchCalibration(id: String, callback: (success: Boolean) -> Unit)

external fun startCustomTouchCalibration(id: String)

external fun completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds)

external fun clearTouchCalibration(id: String)

external fun setMirrorMode(info: MirrorModeInfo, callback: () -> Unit)

external fun setMirrorMode(info: MirrorModeInfoMixed, callback: () -> Unit)

external var onDisplayChanged: Event<() -> Unit>