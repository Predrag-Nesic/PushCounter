package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PushCounterPanel extends JPanel {
    private int counter;
    private JButton button;
    private JLabel label;

    public PushCounterPanel() {
        counter = 0;
        button = new JButton("Push me");
        label = new JLabel("Pushes: " + counter);
        button.addActionListener(new ButtonListener());
        add(button);
        add(label);
    }

    public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("Pushes: " + counter);
            System.out.println("Clicked.");
        }
    }
}
