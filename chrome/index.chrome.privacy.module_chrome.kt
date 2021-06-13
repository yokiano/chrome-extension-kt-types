@file:JsQualifier("chrome.privacy")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.privacy

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

external interface Services {
    var spellingServiceEnabled: ChromeSetting
    var searchSuggestEnabled: ChromeSetting
    var instantEnabled: ChromeSetting
    var alternateErrorPagesEnabled: ChromeSetting
    var safeBrowsingEnabled: ChromeSetting
    var autofillEnabled: ChromeSetting
    var translationServiceEnabled: ChromeSetting
    var passwordSavingEnabled: ChromeSetting
    var hotwordSearchEnabled: ChromeSetting
    var safeBrowsingExtendedReportingEnabled: ChromeSetting
    var autofillAddressEnabled: ChromeSetting
    var autofillCreditCardEnabled: ChromeSetting
}

external interface Network {
    var networkPredictionEnabled: ChromeSetting
    var webRTCMultipleRoutesEnabled: ChromeSetting
    var webRTCNonProxiedUdpEnabled: ChromeSetting
    var webRTCIPHandlingPolicy: ChromeSetting
}

external interface Websites {
    var thirdPartyCookiesAllowed: ChromeSetting
    var referrersEnabled: ChromeSetting
    var hyperlinkAuditingEnabled: ChromeSetting
    var protectedContentEnabled: ChromeSetting
    var doNotTrackEnabled: ChromeSetting
}

external var services: Services

external var network: Network

external var websites: Websites