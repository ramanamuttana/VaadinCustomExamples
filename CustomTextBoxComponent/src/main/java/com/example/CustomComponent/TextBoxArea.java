package com.example.CustomComponent;

import com.vaadin.ui.*;

public class TextBoxArea extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public TextBoxArea(String message) {
        // A layout structure used for composition
        Panel panel = new Panel(" Panel at TOP ");
        HorizontalLayout verticalLayoutContent = new HorizontalLayout();
        panel.setContent(verticalLayoutContent);

        // Compose from multiple components
        Label label = new Label(message);
        verticalLayoutContent.addComponent(label);
        verticalLayoutContent.addComponent(new TextField());

        // The composition root MUST be set
        setCompositionRoot(panel);

        // Set the size as undefined at all levels
        verticalLayoutContent.setSizeUndefined();
        panel.setSizeUndefined();
        // this is not needed for a Composite
        setSizeUndefined();
    }


	public String getValue() {
		return null;
	}
}
