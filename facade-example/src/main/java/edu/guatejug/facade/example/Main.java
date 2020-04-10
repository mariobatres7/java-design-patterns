package edu.guatejug.facade.example;

import edu.guatejug.facade.example.services.impl.ServiceFacade;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mario Batres
 */
public class Main extends JFrame {

    private final ServiceFacade serviceFacade;

    public Main() throws HeadlessException {
        this.init();

        this.serviceFacade = new ServiceFacade();
    }

    private void init() {
        this.setLayout(new GridLayout(2, 1));
        this.setSize(320, 240);
        this.setTitle("Guatejug:  Facade Pattern");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationByPlatform(true);

        JLabel titleLabel = new JLabel("Facade Pattern", JLabel.CENTER);

        titleLabel.setFont(new Font("Roboto", 1, 40));

        this.add(titleLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setSize(640, 480);

        Font buttonFont = new Font("Roboto Condensed", 0, 20);

        JButton initButton = new JButton("Iniciar", new ImageIcon(this.getClass().getResource("start.png")));
        JButton finishButton = new JButton("Finalizar", new ImageIcon(this.getClass().getResource("stop.png")));
        initButton.setFont(buttonFont);
        finishButton.setFont(buttonFont);

        initButton.addActionListener((e) -> {

            this.startService();

            initButton.setEnabled(false);
            finishButton.setEnabled(true);

        });

        finishButton.addActionListener((e) -> {

            this.finishService();

            finishButton.setEnabled(false);
            initButton.setEnabled(true);
        });
        finishButton.setEnabled(false);

        buttonPanel.add(initButton);
        buttonPanel.add(finishButton);

        this.add(buttonPanel);

    }

    private void startService() {

        System.out.println();
        this.serviceFacade.start();

        JOptionPane.showMessageDialog(null, "Servicio iniciado", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void finishService() {

        System.out.println();
        
        this.serviceFacade.finish();

        JOptionPane.showMessageDialog(null, "Servicio finalizado", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        Main main = new Main();

        main.setVisible(true);
    }

}
