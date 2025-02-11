package TNStraining;

class Customer{
	private String customername;
	private int custid;
	private String custnameString;
	
	//default
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	//parameterized
	public Customer(String customername, int custid, String custnameString) {
		System.out.println("Parameterized Contructor");
		this.customername = customername; //this defines the current value 
		this.custid = custid;
		this.custnameString = custnameString;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustnameString() {
		return custnameString;
	}

	public void setCustnameString(String custnameString) {
		this.custnameString = custnameString;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", custid=" + custid + ", custnameString=" + custnameString
				+ "]";
	}
	
}

public class CustomerCons {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer();
		c.setCustid(39);
		c.setCustomername("Pranav");
		c.setCustnameString("Pune");
		System.out.println(c);		Customer c1 = new Customer("Pranav", 39, "Pune");
		System.out.println(c1);
	}

}
