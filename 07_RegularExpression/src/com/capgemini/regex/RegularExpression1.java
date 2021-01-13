package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {
	public static void main(String[] args) {
		String str = "Swetha Senthilkumar";
		
		//Create pattern to be searched
		Pattern pattern = Pattern.compile("ku");
		
		//Searching the pattern inside str
		Matcher match = pattern.matcher(str);
		
		//displays the actual location
		while(match.find()) {
			System.out.println("Found at: "+match.start()+" "+(match.end()-1));
		}
	}
}
