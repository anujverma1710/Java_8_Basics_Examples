package io.javabrains.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] args) {
		
		String text = "java lessons";
		String re = "\\w";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(text);
		
		boolean res = m.matches();
		System.out.println(res);
	}

}
