package Logical_program;

import java.util.Scanner;

public class prog3_accept_input_from_user {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your name: ");
		String s1 = scan.next();
		System.out.println(s1.toUpperCase());
		
		System.out.println("enter num1: ");
		int num1 = scan.nextInt();
		System.out.println("enter num2: ");
		int num2 = scan.nextInt();
		
		System.out.println("addition of num1 and num2 is : "+(num1+num2));
	}
	
	
}
