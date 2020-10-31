package com.techreturners.exercise004;

import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Exercise004 {

	// Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
	// Leave punctuation marks untouched.

	public String pigLatin(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		StringJoiner result = new StringJoiner(" ");
		while (tokenizer.hasMoreElements()) {
			StringBuilder sb = new StringBuilder(tokenizer.nextToken());
			if (Pattern.matches("\\p{Punct}", Character.toString(sb.toString().charAt(sb.length()-1)))) {
			    sb.insert(sb.toString().length()-1, sb.charAt(0));
			    sb.insert(sb.toString().length()-1, "ay");
			}
			else {
				sb.append(sb.charAt(0));
				sb.append("ay");
			}
			sb.deleteCharAt(0);
			result.add(sb);
		}

		return result.toString();
	}
}
