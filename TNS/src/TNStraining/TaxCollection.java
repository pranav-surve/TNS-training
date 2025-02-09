package TNStraining;

import java.util.*;

class Person{
	private String name;
	private int income ;
	private String gender ;
	private int age ;
	private int tax ;
	
	//getter setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	//Object to String 
	@Override
	public String toString() {
		return "person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
}

class TaxCal{
	
	public void calcualtetax(Person person ) {
		if(person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax nor applicable");
		}
		else {
			if(person.getIncome()<=200000) {
				person.setTax(0);
			}
			else if (person.getIncome() > 200000 && person.getIncome() <= 500000) {
				person.setTax((person.getIncome() - 200000) * 10/100);
			}
			else if (person.getIncome() > 500000 && person.getIncome() <= 800000) {
				person.setTax((person.getIncome() - 500000) * 20/100 + 30000);
			}
			else {
				person.setTax((person.getIncome() - 800000) * 30/100 + 90000);
			}
		}
	}
}
public class TaxCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter Income");
		int income = sc.nextInt() ;
		
		System.out.println("Enter Gender");
		String gender = sc.next() ;
		
		System.out.println("Enter Age");
		int age = sc.nextInt() ;
		
		
		Person person=new Person();
		person.setName(name);
		person.setIncome(income);
		person.setGender(gender);
		person.setAge(age);
		
		
		System.out.println(person);
		
		TaxCal tCal = new TaxCal();
		tCal.calcualtetax(person);
		
		System.out.println("After calculation of tax");
		System.out.println(person);
		
	}

}
