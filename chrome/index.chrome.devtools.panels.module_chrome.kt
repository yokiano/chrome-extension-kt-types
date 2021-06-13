@file:JsQualifier("chrome.devtools.panels")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package chrome.devtools.panels

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
import chrome.windows.Window
import chrome.devtools.inspectedWindow.Resource

external interface PanelShownEvent : Event<(window: Window) -> Unit>

external interface PanelHiddenEvent : Event<() -> Unit>

external interface PanelSearchEvent : Event<(action: String, queryString: String) -> Unit>

external interface ExtensionPanel {
    fun createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): Button
    var onShown: PanelShownEvent
    var onHidden: PanelHiddenEvent
    var onSearch: PanelSearchEvent
}

external interface ButtonClickedEvent : Event<() -> Unit>

external interface Button {
    fun update(iconPath: String? = definedExternally, tooltipText: String? = definedExternally, disabled: Boolean? = definedExternally)
    var onClicked: ButtonClickedEvent
}

external interface SelectionChangedEvent : Event<() -> Unit>

external interface ElementsPanel {
    fun createSidebarPane(title: String, callback: (result: ExtensionSidebarPane) -> Unit = definedExternally)
    var onSelectionChanged: SelectionChangedEvent
}

external interface SourcesPanel {
    fun createSidebarPane(title: String, callback: (result: ExtensionSidebarPane) -> Unit = definedExternally)
    var onSelectionChanged: SelectionChangedEvent
}

external interface ExtensionSidebarPaneShownEvent : Event<(window: Window) -> Unit>

external interface ExtensionSidebarPaneHiddenEvent : Event<() -> Unit>

external interface ExtensionSidebarPane {
    fun setHeight(height: String)
    fun setExpression(expression: String, rootTitle: String = definedExternally, callback: () -> Unit = definedExternally)
    fun setExpression(expression: String)
    fun setExpression(expression: String, rootTitle: String = definedExternally)
    fun setExpression(expression: String, callback: () -> Unit = definedExternally)
    fun setObject(jsonObject: Any, rootTitle: String = definedExternally, callback: () -> Unit = definedExternally)
    fun setObject(jsonObject: Any)
    fun setObject(jsonObject: Any, rootTitle: String = definedExternally)
    fun setObject(jsonObject: Any, callback: () -> Unit = definedExternally)
    fun setPage(path: String)
    var onShown: ExtensionSidebarPaneShownEvent
    var onHidden: ExtensionSidebarPaneHiddenEvent
}

external var elements: ElementsPanel

external var sources: SourcesPanel

external fun create(title: String, iconPath: String, pagePath: String, callback: (panel: ExtensionPanel) -> Unit = definedExternally)

external fun setOpenResourceHandler(callback: (resource: Resource) -> Unit = definedExternally)

external fun openResource(url: String, lineNumber: Number, callback: () -> Unit)

external var themeName: String /* "default" | "dark" */