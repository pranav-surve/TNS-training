package TNStraining;


public class AccessSpecifier {
	int def=10;
	public int varpub=10;
	private int varpri=10 ;
	protected int varpro=10;
	
	void methodDefault() {
		System.out.println("Default var");
		System.out.println(def);
	}
	
	public void methodpublic() {
		System.out.println("Public var");
		System.out.println(varpub);
	}
	
	private void methodprivate() {
		System.out.println("Private var");
		System.out.println(varpri);
	}
	
	protected void methodprotected() {
		System.out.println("Protected var");
		System.out.println(varpro);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
