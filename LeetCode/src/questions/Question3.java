package questions;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.


Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.*/
public class Question3 {

	public static void main(String[] args) {

		String s = "abccabcd";
		System.out.println(LongestSubstring(s));
	}
	
	public static int LongestSubstring(String s) {
//		int maxLength = 0;
		int left = 0;
		int maxLength = 0;
		HashSet<Character> hset = new LinkedHashSet<Character>();
		
		for(int right=0; right<s.length(); right++) {
			
			while(hset.contains(s.charAt(right))) {
				hset.remove(s.charAt(left));
				left++;
			}
			
			hset.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);

		}
		
		
		return maxLength;
	}

}
