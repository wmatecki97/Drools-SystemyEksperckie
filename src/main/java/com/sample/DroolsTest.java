package com.sample;
import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

	
    
    public static final void main(String[] args) {
        try {
//        	QuestionWindow.updateFrame("pytanie", "odpowiedz1", "odpowiedz2", "odpowiedz3");


        	/////////////////////////////////////////////
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

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
