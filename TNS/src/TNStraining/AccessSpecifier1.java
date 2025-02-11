package TNStraining;

public class AccessSpecifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier  b = new AccessSpecifier();
		b.methodDefault();
		b.methodprotected();
		b.methodpublic();
		
		b.varpro=12;
		b.varpub=123;
		b.def=1;
		
		System.out.println("Protected");
		System.out.println(b.varpro);
	}

}
