package edu.guatejug.decorator.example.component;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mario Batres
 */
public class ConcretePanelAttribute implements PanelAttribute {

    @Override
    public void draw(JPanel panel) {

        panel.removeAll();

        JLabel label = new JLabel("Atributos");

        panel.add(label);
    }

}
