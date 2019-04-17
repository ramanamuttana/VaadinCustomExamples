package com.example.CustomComponent;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class TextBoxArea extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public TextBoxArea(String message) {
        // A layout structure used for composition
        Panel panel = new Panel("My Custom Component");
        VerticalLayout panelContent = new VerticalLayout();
        panel.setContent(panelContent);

        // Compose from multiple components
        Label label = new Label(message);
        panelContent.addComponent(label);
        panelContent.addComponent(new Button("Ok"));

        // The composition root MUST be set
        setCompositionRoot(panel);

        // Set the size as undefined at all levels
        panelContent.setSizeUndefined();
        panel.setSizeUndefined();
        // this is not needed for a Composite
        setSizeUndefined();
    }


	public String getValue() {
		return null;
	}
}
