package edu.guatejug.decorator.example;

import edu.guatejug.decorator.example.component.ConcretePanelAttribute;
import edu.guatejug.decorator.example.component.PanelAttribute;
import edu.guatejug.decorator.example.decorator.CheckPanelAttribute;
import edu.guatejug.decorator.example.decorator.IntegerPanelAttribute;
import edu.guatejug.decorator.example.decorator.RadioPanelAttribute;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mario Batres
 */
public class Main extends JFrame {

    public Main() throws HeadlessException {
        this.init();
    }

    private void init() {

        this.setLayout(new GridLayout(5, 1));
        this.setSize(720, 240);
        this.setTitle("Guatejug:  Decorator Pattern");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationByPlatform(true);

        JLabel titleLabel = new JLabel("Decorator Pattern", JLabel.CENTER);

        titleLabel.setFont(new Font("Roboto", 1, 40));

        this.add(titleLabel);

        JCheckBox integerCheckBox = new JCheckBox("Atributo Int");

        JCheckBox checkCheckBox = new JCheckBox("Atributo Check");

        JCheckBox radioCheckBox = new JCheckBox("Atributo DateTime");

        JPanel checkBoxPanel = new JPanel(new FlowLayout());
        checkBoxPanel.add(integerCheckBox);
        checkBoxPanel.add(checkCheckBox);
        checkBoxPanel.add(radioCheckBox);

        this.add(checkBoxPanel);

        JButton createButton = new JButton("Crear");
        createButton.setFont(new Font("Roboto Condensed", 0, 20));

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(createButton);

        this.add(buttonPanel);

        JPanel panel = new JPanel(new FlowLayout());

        createButton.addActionListener((e) -> this.createPanel(panel, integerCheckBox.isSelected(), checkCheckBox.isSelected(), radioCheckBox.isSelected()));

        this.add(panel);

    }

    private void createPanel(JPanel panel, boolean withInteger, boolean withCheck, boolean withRadio) {

        PanelAttribute panelAttribute = new ConcretePanelAttribute();

        if (withInteger) {
            panelAttribute = new IntegerPanelAttribute(panelAttribute);
        }

        if (withCheck) {

            panelAttribute = new CheckPanelAttribute(panelAttribute);
        }

        if (withRadio) {

            panelAttribute = new RadioPanelAttribute(panelAttribute);
        }

        panelAttribute.draw(panel);

        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.setVisible(true);
    }
}
