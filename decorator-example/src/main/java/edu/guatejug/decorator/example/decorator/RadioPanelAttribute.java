package edu.guatejug.decorator.example.decorator;

import edu.guatejug.decorator.example.component.DecoratorPanelAttribute;
import edu.guatejug.decorator.example.component.PanelAttribute;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Mario Batres
 */
public class RadioPanelAttribute extends DecoratorPanelAttribute {

    public RadioPanelAttribute(PanelAttribute panelAttribute) {
        super(panelAttribute);
    }

    @Override
    public void draw(JPanel panel) {

        this.panelAttribute.draw(panel);

        JLabel label = new JLabel("Atributo Radio:  ");

        JRadioButton radioButton = new JRadioButton();

        JPanel container = new JPanel(new FlowLayout());

        container.add(label);
        container.add(radioButton);

        panel.add(container);
    }

}
