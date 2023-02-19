package Anagram;

import java.util.Arrays;

public class AnagramAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="Brag";
     String str2="Grab";
     
     str1=str1.toLowerCase();
     str2=str2.toLowerCase();
      
     if (str1.length()!=str2.length()) {
    	System.out.println("Not Anagram"); 
     }
     else {
    	 char[] String1=str1.toCharArray();
    	 char[] String2=str2.toCharArray();
    	 
    	 Arrays.sort(String1);
    	 Arrays.sort(String2);
    	 
    	 if(Arrays.equals(String1,String2)==true) {
    		 System.out.println("Both are Anagram");
    	 }
    	 else {
    		 System.out.println("Both are not Anagram");
    	 }
     }
	}

}
