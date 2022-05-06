package com.BaseLayer;

public class demo3 {

	public static void main(String[] args) {

		String a = "s214$#@$[pqr";

		char[] abc = a.toCharArray();

		for (int i = 0; i < abc.length; i++) 
		{
			if (Character.isDigit(abc[i])) 
			{
				System.out.println("Number is " + abc[i]);
			} 
			else if (Character.isAlphabetic(abc[i])) {
				System.out.println();
				System.out.println("character is " + abc[i]);
			} 
			else {
				System.out.println("Special character is " + abc[i]);
			}
		}

	}

}
