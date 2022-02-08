package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String pattern="[A-Za-z0-9]{6}";
		Pattern p=Pattern.compile(pattern);
		Matcher match =p.matcher("harsha");
		System.out.println("res"+match.matches());
	}
}
