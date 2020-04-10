package edu.guatejug.decorator.example.decorator;

import edu.guatejug.decorator.example.component.DecoratorPanelAttribute;
import edu.guatejug.decorator.example.component.PanelAttribute;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mario Batres
 */
public class CheckPanelAttribute extends DecoratorPanelAttribute {

    public CheckPanelAttribute(PanelAttribute panelAttribute) {
        super(panelAttribute);
    }

    @Override
    public void draw(JPanel panel) {

        this.panelAttribute.draw(panel);

        JLabel label = new JLabel("Atributo Check:  ");

        JCheckBox checkBox = new JCheckBox();

        JPanel container = new JPanel(new FlowLayout());

        container.add(label);
        container.add(checkBox);

        panel.add(container);
    }

}
