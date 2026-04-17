package javaInterviewcoding;

import java.util.HashMap;

public class FirstNonRepeatingCharacterFromString {
	public static void main(String[] args) {
		String str = "abcdbda";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:str.toCharArray()) {
			if(hm.get(ch)==1) {
				System.out.println("First Non Repeating Character From String is "+ch);
			}
		}
		
	}
	
}
