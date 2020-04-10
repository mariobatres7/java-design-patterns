package edu.guatejug.factory.method.example;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Mario Batres
 */
public class Main extends JFrame {

    public Main() throws HeadlessException {
        this.init();
    }

    private void init() {

        this.setLayout(new GridLayout(4, 1));
        this.setSize(520, 240);
        this.setTitle("Guatejug:  Factory Method Pattern");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationByPlatform(true);

        JLabel titleLabel = new JLabel("Factory Method Pattern", JLabel.CENTER);

        titleLabel.setFont(new Font("Roboto", 1, 40));

        this.add(titleLabel);

        Font radioButtonFont = new Font("Roboto", 1, 16);

        JRadioButton invoiceRadioButton = new JRadioButton("Factura", true);
        invoiceRadioButton.setActionCommand(DocumentFactory.DocumentType.INVOICE.name());
        invoiceRadioButton.setFont(radioButtonFont);

        JRadioButton ticketRadioButton = new JRadioButton("Ticket", false);
        ticketRadioButton.setActionCommand(DocumentFactory.DocumentType.TICKET.name());
        ticketRadioButton.setFont(radioButtonFont);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(invoiceRadioButton);
        buttonGroup.add(ticketRadioButton);

        JPanel radioButtonPanel = new JPanel(new FlowLayout());

        radioButtonPanel.add(invoiceRadioButton);
        radioButtonPanel.add(ticketRadioButton);

        this.add(radioButtonPanel);

        JButton documentButton = new JButton("Crear Documento");
        documentButton.setFont(new Font("Roboto Condensed", 0, 20));

        documentButton.addActionListener((e) -> {

            DocumentFactory.DocumentType documentType = DocumentFactory.DocumentType.valueOf(buttonGroup.getSelection().getActionCommand());

            this.createDocument(documentType);

        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(documentButton);

        this.add(buttonPanel);

    }

    private void createDocument(DocumentFactory.DocumentType documentType) {

        Document document = DocumentFactory.createDocument(documentType);

        JOptionPane.showMessageDialog(null, "Creado Documento " + document.getName(), "Información", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }

}
