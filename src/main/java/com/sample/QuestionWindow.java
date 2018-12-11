package com.sample;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuestionWindow {
	public static JFrame frame;
	
	public static String updateFrame(String questionValue, List<String> options) {
		int index = JOptionPane.showOptionDialog(null, questionValue,
                "Wybierz odpowiedz",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options.toArray(new String[options.size()]), options.get(0));
		
		return options.get(index);
	}
	
	public static void showResults(String info) {
		JOptionPane.showMessageDialog(frame, "You should play: " + info);
		DroolsTest.resetSession();
	}
}
