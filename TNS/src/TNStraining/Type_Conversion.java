package TNStraining;

public class Type_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IMPLICIT
		byte i=10;
		int b=i;
		
		System.out.println(b);
		
		float j = 100/3f;
		double d = j;
		
		System.out.println(d);
		
		char k = 'A';
		int a = k;
		
		//EXPLICIT
		double f = 10.521;
		long h = (long) f;
		
		System.out.println(h);
		
		long q = 234598385;
		int m = (int) q;
		
		System.out.println(m);
		
		int xyz = 130;
		byte qq = (byte) xyz ;
		
		System.out.println(qq);
		
	

	}

}
