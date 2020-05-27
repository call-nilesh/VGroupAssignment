package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

public class PermutationClass {
	public static List<String> generatePermutations(String input) {
		 
        List<String> strList = new ArrayList<String>();
        PermutationClass.permutations("", input, strList);
        System.out.println("data="+strList);
        return strList;
        
    }
	
	
	private static void permutations(String consChars, String input, List<String> opContainer) {
		 
        if(input.isEmpty()) {
        	
        	 System.out.println("input="+input);
        	 System.out.println("opContainer="+opContainer);
            opContainer.add(consChars+input);
            return;
        }
 
        for(int i=0; i<input.length(); i++) {
            permutations(consChars+input.charAt(i),
                            input.substring(0, i)+input.substring(i+1),
                            opContainer);
        }

}

}
