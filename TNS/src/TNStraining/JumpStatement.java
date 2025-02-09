package TNStraining;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BREAK");
		for(int i=5 ; i<10 ; i++) {
			if(i==5) {
				System.out.println(i);
				break;
			}
			System.out.println("HELLO");
		}
		
		System.out.println("CONTINUE");
		for(int k=5 ; k<15 ; k++) {
			if(k%2 !=0) {
				continue;
			}
			System.out.println(k);
		}
		
		System.out.println("SWITCH");
		char x = 'l';
		
		switch(x) {
		case 'l' : 
		case 'L' :
			System.out.println("Hello");
			break;
		case 'j' :
		case 'J' :
			System.out.println("BYE");
			break;
			
		default :
			System.out.println("NOTHING");
		}
	}

}
