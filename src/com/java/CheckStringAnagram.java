package com.java;

public class CheckStringAnagram {

	public static void main(String[] args) {
		String s1 = "woman hitler";
		String s2 = "mother-in-law";
		
		
		Boolean anagram = anagram(s1,s2);
		if(anagram){
			System.out.println("Strings are anagram of each other");
		}
		else{
			System.out.println("Strings are not anagram of each other");
				
		}
	}
	
	public static Boolean anagram (String s1, String s2){
		
		s1 = s1.replaceAll("\\s","");         //omitting spaces
		s1 = s1.replaceAll("[-+^]*", "");		//omitting special char
		s2 = s2.replaceAll("\\s",""); 			
		s2 = s2.replaceAll("[-+^]*", "");
		
		
		if( s1.length()!= s2.length())
			return false;
		else{

			char[] cs1 = s1.toCharArray();
			char[] cs2 = s2.toCharArray();
			
			for(int i =0; i< cs1.length; i++)
			{
				for(int j =0; j< cs2.length;j++)
				{
					 if(cs1[i] == cs2[j])
					 {
						 cs2[j] = '*';
						 break;
					 }
				}
				
			}
			for(int k = 0; k < cs2.length; k++)
			{
				if(cs2[k] != '*')
					return false;
			
			}
			return true;

		}
	}
}


