/**
* to run:
* javac -cp . com\example\pac1\*.java com\example\pac2\*.java
* java -cp . com.example.pac2.MyStaticImportExmp
*/

package com.example.pac1;

public class MyStaticMembClass {
	
	public static final int INCREMENT = 2;
	
	public static int incrementNumber(int number) {
		return number + INCREMENT;
	}
}
