package TNStraining;

import java.util.jar.Attributes.Name;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FOR LOOP");
		for (int i = 0 ; i<10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("WHILE LOOP");
		int j = 10;
		
		while(j<20) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("DO-WHILE LOOP");
		
		int k=20;
		do {
			System.out.println(k);
			k++;
		}while(k<20);
		
		System.out.println("FOR EACH LOOP");
		
		int l[] = {1,2,3,4,5}; 
		
		for(int m : l) {
			System.out.println(m);
		}
		
		char ch[] = {'H','E','L','L','O'};
		
		for(char name : ch ) {
			System.out.println(name);
		}
		System.out.println("NESTED FOR LOOP");
		
		int a=10;
		int b=20;
		
		for(int i = a ; i<=b ; i++) {
			for(j=1 ; j<=10 ; j++) {
				System.out.println(i*j);
			}
		}
		
	}

}
