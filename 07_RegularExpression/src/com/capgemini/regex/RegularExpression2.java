package com.capgemini.regex;

public class RegularExpression2 {
	
	private static boolean isFirstNameValid(String name) {
		boolean result = name.matches("^[A-Za-z]+$");
		return result;
	}
	
	//private static boolean isMobileValid(String mobile) {
	//	boolean result = mobile.matches("^[6-9]{1}[0-9]{9}+$");
	//	return result;
	//}
	
	private static boolean isMobileValid(String mobile) {
		boolean result = mobile.matches("^\\d{10}$");
		return result;
	}
	
	private static boolean isNameValid(String name) {
		boolean result = name.matches("^[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+$");
		return result;
	}
	
	public static void main(String[] args) {
		String firstName = "Swetha";
		System.out.println("Is "+firstName+" is valid? : "+isFirstNameValid(firstName));
		String mobile = "8531970678";
		System.out.println("Is "+mobile+" is valid? : "+isMobileValid(mobile));
		String name = "Swetha Senthilkumar";
		System.out.println("Is "+name+" is valid? : "+isNameValid(name));
	}
}
