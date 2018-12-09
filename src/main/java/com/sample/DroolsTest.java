package com.sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.*;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {
	
	
    
    public static final void main(String[] args) {
        try {

        	Frame.createFrame();
        	Frame.updateFrame("pytanie1", "odpowiedz1", "odpowiedz2");
        	Frame.updateFrame("pytanie2", "odpowiedz1", "odpowiedz2", "odpowiedz3");
        	
        	/////////////////////////////////////////////
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
//
//            // go !
////            Message message = new Message();
////            message.setMessage("Hello World");
////            message.setStatus(Message.HELLO);
////            kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Question {
        public String content;
        public ArrayList<String> answers;
        public boolean proceeded;
        
        public Question() {
        	answers = new ArrayList<String>();
        }
    }

    public static class Result{
        ArrayList<String> results;
        
        public Result() {
        	results = new ArrayList<String>();
        }
    }
    
    

}
