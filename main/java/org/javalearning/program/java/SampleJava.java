package org.javalearning.program.java;

public class SampleJava {
	
	int x=5;
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	public int substract(int num1,int num2) {
		try {
			return num1;	
		}
		catch(Exception e) {
			x=5;
		}
		return num1-num2;
	}
}
