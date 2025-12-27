package logicalPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class StringPrograms {

	public static void main(String[] args) {

		String str = "java Selenium automatioN 1234 !@#";

		// count each character occurrence in string
		System.out.println("--- count each character occurrence in string ---");

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		for (char ch : hm.keySet()) {
			System.out.println(ch + " : " + hm.get(ch));
		}

		// check and count the vowels in the string
		System.out.println("----- check and count the vowels in the string -----");

		int vowelCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ("aeiou".indexOf(ch) >= 0) {
				vowelCount++;
				System.out.println(ch);
			}
		}

		if (vowelCount > 0) {
			System.out.println("String contains vowels : " + vowelCount);
		} else {
			System.out.println("String not contains vowels");
		}

		
		// Reverse string but keep space position same
		System.out.println("----- Reverse string but keep space position same -----");
		
		char [] chArr = str.toCharArray();
		int len = chArr.length;
		char [] result = new char[len];
		
		for(int i=0; i<len; i++) {
			if(chArr[i] == ' ') {
				result[i] = ' ';
			}
		}
		
		int lastIndex = len-1;
		for(int i=0; i<len; i++) {
			if(chArr[i] != ' ') {
				while(result[lastIndex] ==' ') {
					lastIndex--;
				}
				result[lastIndex] = chArr[i];
				lastIndex--;
			}
		}
		System.out.println(new String(result));
		
		
		// Reverse casing
		System.out.println("----- Reverse casing -----");
		
		StringBuffer sb =  new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
		
		// Count the upperCase , lowerCase, digits and special chars from string 
		System.out.println("----- Count the upperCase , lowerCase, digits and special chars from string -----");
		
		int lowerCaseCount=0;
		int upperCaseCount=0;
		int digitCount=0;
		int spaceCount=0;
		int specialCharCount=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
			else if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			else if(Character.isDigit(ch)){
				digitCount++;
			}
			else if(Character.isSpaceChar(ch)) {
				spaceCount++;
			}
			else {
				specialCharCount++;
			}
		}
		System.out.println("lowerCaseCount : "+ lowerCaseCount);
		System.out.println("upperCaseCount : "+ upperCaseCount);
		System.out.println("digitCount : "+ digitCount);
		System.out.println("spaceCount : "+ spaceCount);
		System.out.println("specialCharCount : "+ specialCharCount);
		
		
		// Reverse String without reversing words
		System.out.println("----- Reverse String without reversing words -----");
		
		String [] strArr = str.split(" ");
		StringBuffer sb2 = new StringBuffer();
		
		for(int i=strArr.length-1; i>=0; i--) {
			sb2.append(strArr[i]+" ");
		}
		System.out.println(sb2);
		
		
		// Reverse words without reversing string
		System.out.println("----- Reverse words without reversing string -----");
		
		StringBuffer sb3 = new StringBuffer();
		
		for(String s1 : strArr) {
			for(int i=s1.length()-1; i>=0; i--) {
				char ch = s1.charAt(i);
				sb3.append(ch);
			}
			sb3.append(" ");
		}
		System.out.println(sb3);
		
		
	}

}























