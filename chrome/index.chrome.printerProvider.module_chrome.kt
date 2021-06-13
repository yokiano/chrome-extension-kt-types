@file:JsQualifier("chrome.printerProvider")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.printerProvider

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

external interface PrinterInfo {
    var id: String
    var name: String
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PrinterCapabilities {
    var capabilities: Any
}

external interface PrintJob {
    var printerId: String
    var title: String
    var ticket: Any
    var contentType: String
    var document: Blob
}

external interface PrinterRequestedEvent : Event<(resultCallback: (printerInfo: Array<PrinterInfo>) -> Unit) -> Unit>

external interface PrinterInfoRequestedEvent : Event<(device: Any, resultCallback: (printerInfo: PrinterInfo) -> Unit) -> Unit>

external interface CapabilityRequestedEvent : Event<(printerId: String, resultCallback: (capabilities: PrinterCapabilities) -> Unit) -> Unit>

external interface PrintRequestedEvent : Event<(printJob: PrintJob, resultCallback: (result: String) -> Unit) -> Unit>

external var onGetPrintersRequested: PrinterRequestedEvent

external var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent

external var onGetCapabilityRequested: CapabilityRequestedEvent

external var onPrintRequested: PrintRequestedEvent