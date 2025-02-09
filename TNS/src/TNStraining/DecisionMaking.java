package TNStraining;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		if(age > 18) {
			System.out.println("Eligible for voting");
		}
		
		int i = 21 ;
		
		if(i>=21) {
			System.out.println("Eligible for marraige");
		}
		else {
			System.out.println("Not ready for marraige");
		}

		int a = 10 , b=20 , c=5 ;
		
		if(a > b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(c>b) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
	}

}
