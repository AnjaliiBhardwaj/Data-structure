/*
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd*/ 

public class Solution {
	public static String replaceCharacter(String input,char c1,char c2){
		return replaceCharacter(input, c1 , c2,0,input.length()-1);
	}
	public static String replaceCharacter(String input, char c1, char c2,int start,int end) {
		 if (start>end){
			 return input;
		 }
		 if(input.charAt(start)==c1){
			 String str=input.substring(0,start)+c2+input.substring(start+1);
			 return replaceCharacter(str,c1,c2,start+1,end);
		 }
		 return replaceCharacter(input,c1,c2,start+1,end);
	}            
}
