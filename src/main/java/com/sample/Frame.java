package com.sample;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Frame{
	public static JFrame frame;
	public static JLabel question;
	public static JRadioButton rdbtnOpcja_2;
    public static JRadioButton rdbtnOpcja_3;
    public static JRadioButton rdbtnOpcja_1;
    private static final ButtonGroup buttonGroup = new ButtonGroup();
    public static JButton btnNewButton;
    
    public static void updateFrame(String questionValue, String... options) {
    	//Hide all buttons  	
    	JRadioButton[] buttons = new JRadioButton[3];
    	buttons[0] = rdbtnOpcja_1;
    	buttons[1] = rdbtnOpcja_2;
    	buttons[2] = rdbtnOpcja_3;
    	
    	for(JRadioButton button : buttons)
    		button.setVisible(false);
    	
    	question.setText(questionValue);
    	
    	for(int i=0; i< options.length; i++) {
    		buttons[i].setVisible(true);
    		buttons[i].setText(options[i]);
    	}
    }
    
    
    public static void processAnswer() {
    	question.setText("wyslano");
    }
    
    public static void createFrame() {
    	frame = new JFrame("Dupa");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		question = new JLabel("Tre\u015B\u0107 pytania");
		question.setBounds(0,25,500,50);
		frame.getContentPane().add(question);
		
		btnNewButton = new JButton("Send");
		btnNewButton.setBounds(0,250,500,50);
		frame.getContentPane().add(btnNewButton);
		
		rdbtnOpcja_2 = new JRadioButton("Opcja 2");
		rdbtnOpcja_2.setBounds(0, 100, 500, 25);
		frame.getContentPane().add(rdbtnOpcja_2);
		buttonGroup.add(rdbtnOpcja_2);
		
		rdbtnOpcja_3 = new JRadioButton("Opcja 3");
		rdbtnOpcja_3.setBounds(0, 150, 500, 25);
		frame.getContentPane().add(rdbtnOpcja_3);
		buttonGroup.add(rdbtnOpcja_3);
		
		rdbtnOpcja_1 = new JRadioButton("Opcja 1");
		rdbtnOpcja_1.setBounds(0, 200, 500, 25);
		frame.getContentPane().add(rdbtnOpcja_1);
		buttonGroup.add(rdbtnOpcja_1);
		
    	frame.setSize(500, 350);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container container = frame.getContentPane();
    	container.add(new JButton("OK"));
    	
    	btnNewButton.addActionListener(new ActionListener() {
    		@Override
            public void actionPerformed(ActionEvent e) {
    			processAnswer();
            }
    	});
    }
}
	