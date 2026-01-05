package logicalPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

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
		
		
// Count the upperCase, lowerCase, digits and special chars from string 
		System.out.println("----- Count the upperCase, lowerCase, digits and special chars from string -----");
		
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
		
		
//Check Pangram - The quick brown fox jumps over the lazy dog
		System.out.println("----- Check Pangram -----");
		
		String str2 = "The quick brown fox jumps over the lazy dog";
		boolean status2 = true;
		str2 = str2.toLowerCase();
		
		if(str2.length() > 26) {
			for(int i='a'; i<='z'; i++) {
				if(str2.indexOf(i) == -1) {
					status2=false;
				}
			}
		}
		else {
			status2=false;
		}
		
		if(status2== true) {
			System.out.println("String is Pangram string");
		}
		else {
			System.out.println("String is not Pangram string");
		}
		
		
// Count the double word from string
		System.out.println("-----Count the double word from string-----");
		
		String str3 = "java selenium automation java selenium java";
		str3 = str3.toLowerCase();
		String [] strArr2 = str3.split(" ");
		
		for(int i=0;  i<strArr2.length; i++) {
			int stringCount =1;
			for(int j=i+1; j<strArr2.length; j++) {
				if(strArr2[i].equals(strArr2[j])) {
					stringCount++;
					strArr2[j]="0";
				}
			}
			if(strArr2[i] != "0" && stringCount > 1) {
				System.out.println(strArr2[i]+" : "+stringCount);
			}
		}
		
		
// Capitalize first letter of each word
		System.out.println("----- Capitalize first letter of each word -----");
		
		String [] strArr3 = str.split(" ");
		
		for(int i=0; i<strArr.length;  i++) {
			String s1 = strArr[i];
			StringBuffer sb4 = new StringBuffer(s1);
			s1 = s1.toUpperCase();
			char ch = s1.charAt(0);
			sb4.setCharAt(0, ch);
			System.out.print(sb4+" ");
		}
		
		
// remove $ from string but keep first and last
		System.out.println("----- remove $ from string but keep first and last -----");
		
		String str4 = "my $ name$ is $ om$";
		
		int first$Index = str4.indexOf('$');
		int last$Index = str4.lastIndexOf("$");
		
		String result2  = str4.substring(0, first$Index+1) + str4.substring(first$Index, last$Index).replace("$", "") + str4.substring(last$Index);
		System.out.println(result2);
		
		
// SubString from string - unique characters
		System.out.println("----- SubString from string - unique characters ------");
		
		HashSet<Character> hs = new HashSet<>();
		StringBuffer sb4 = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(hs.add(ch)) {
				sb4.append(ch);
			}
		}
		System.out.println(sb4);
		System.out.println(sb4.toString());
	}

}

