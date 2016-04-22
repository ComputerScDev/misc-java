/**
* to run:
* javac -cp . com\example\pac1\*.java com\example\pac2\*.java
* java -cp . com.example.pac2.MyStaticImportExmp
*/

package com.example.pac2;

import static com.example.pac1.MyStaticMembClass.*;

public class MyStaticImportExmp {
	
	public static void main(String[] args) {
		System.out.println("increment value: " + INCREMENT);
		int count = 10;
		System.out.println("increment count: " + incrementNumber(count));
		System.out.println("increment count: " + incrementNumber(count));
	}
}
