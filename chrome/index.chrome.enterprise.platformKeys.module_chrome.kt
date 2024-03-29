@file:JsQualifier("chrome.enterprise.platformKeys")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.enterprise.platformKeys

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

external fun getCertificates(tokenId: String, callback: (certificates: Array<ArrayBuffer>) -> Unit)

external fun importCertificate(tokenId: String, certificate: ArrayBuffer, callback: () -> Unit = definedExternally)

external fun removeCertificate(tokenId: String, certificate: ArrayBuffer, callback: () -> Unit = definedExternally)

external fun challengeMachineKey(challenge: ArrayBuffer, registerKey: Boolean, callback: (response: ArrayBuffer) -> Unit)

external fun challengeMachineKey(challenge: ArrayBuffer, callback: (response: ArrayBuffer) -> Unit)

external fun challengeUserKey(challenge: ArrayBuffer, registerKey: Boolean, callback: (response: ArrayBuffer) -> Unit)