package Homework;

import java.util.Scanner;

public class IfElseLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter username");
		String i = scanner.nextLine();
		
		System.out.println("Enter Password");
		int j = scanner.nextInt();
		
		String a = "Pranav";
		int b = 345;
		
		if(a.equals(i)) {
			if(b==j) {
				System.out.println("Successfull Login");
			}
			else {
				System.out.println("Wrong password");
			}
		}
		else {
			System.out.println("Wrong Username");
			if(b==j) {
				System.out.println("Correct password , check username");
			}
			else {
				System.out.println("Wrong password");
			}
		}
		
	}

}
