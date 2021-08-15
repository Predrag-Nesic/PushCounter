package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame("Push counter");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel panel = new PushCounterPanel();

	    frame.getContentPane().add(panel);

	    frame.pack();
	    frame.setVisible(true);
    }
}