package TNStraining;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int a = 10 ;
		int b= 20 ;
		int c = 30 ;
		
		System.out.println("Before" + a + " " +b);
		
		++a;
		//       12   20   12
		int x = ++a + b + a--;
		
		System.out.println(x);
	}

}
