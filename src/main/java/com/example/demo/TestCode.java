package com.example.demo;


import java.util.ArrayList;
import java.util.List;

/*
 This page gives an example to print all permutations of a given string. For example, xy would be xy and yx.

Here is the steps to implement string permutations:

Take out the first char and keep it constant. And permute rest of the characters.
User recursive method call to permute rest of the string except first character.
While making recursive call, we accumulate each character being constant along with recursive call response.
 */
public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> output = TestCode.generatePermutations("abc");
        System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);
        System.out.println("------------------");
	}
	
	public static List<String> generatePermutations(String input) {
		 
        List<String> strList = new ArrayList<String>();
        TestCode.permutations("", input, strList);
     //   System.out.println("data="+strList);
        return strList;
        
    }
	
	
	private static void permutations(String consChars, String input, List<String> opContainer) {
		 
        if(input.isEmpty()) {
        	
        //	 System.out.println("input="+input);
        //	 System.out.println("opContainer="+opContainer);
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
