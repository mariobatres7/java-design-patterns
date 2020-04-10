package edu.guatejug.decorator.example.decorator;

import edu.guatejug.decorator.example.component.DecoratorPanelAttribute;
import edu.guatejug.decorator.example.component.PanelAttribute;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mario Batres
 */
public class IntegerPanelAttribute extends DecoratorPanelAttribute {

    public IntegerPanelAttribute(PanelAttribute panelAttribute) {
        super(panelAttribute);
    }

    @Override
    public void draw(JPanel panel) {

        this.panelAttribute.draw(panel);

        JLabel label = new JLabel("Atributo Entero:  ");

        
        JTextField textField = new JTextField(1);
        
        JPanel container = new JPanel(new FlowLayout());

        container.add(label);
        container.add(textField);

        panel.add(container);
    }

}
