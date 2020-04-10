package edu.guatejug.decorator.example.component;

/**
 *
 * @author Mario Batres
 */
public abstract class DecoratorPanelAttribute implements PanelAttribute {

    protected final PanelAttribute panelAttribute;

    public DecoratorPanelAttribute(PanelAttribute panelAttribute) {

        this.panelAttribute = panelAttribute;
    }

}
