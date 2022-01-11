package A_Basic_Java;

public class M_Constructor_Example {

	//gloable variables
	double pi_g, taxAmount_g,total_g; //declrations
	double price_g=100,tax_g=14; //declaration and assign value
	
	// default constructor
	public M_Constructor_Example() {
		System.out.println("Default constructor");
	}
	//single paramerised constructor
	public M_Constructor_Example(double tax_l) {
		tax_g=tax_l;
		System.out.println("value of single parametrised constructor is: "+tax_g);
	}
	public M_Constructor_Example(double price_l,double tax_l) {
		price_g=price_l;
		tax_g=tax_l;
		taxAmount_g=price_g*tax_g/100;
		System.out.println("Two pearamerised constructor:tax is: "+taxAmount_g);
	}
	//method
	public void totalAmount() {
		total_g=price_g+(price_g*tax_g/100);
		System.out.println("total amount is:"+total_g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_Constructor_Example m= new M_Constructor_Example();
		M_Constructor_Example m1= new M_Constructor_Example(10);
		M_Constructor_Example m2 = new M_Constructor_Example(1500,10);
		
		m.totalAmount();
		m1.totalAmount();
		m2.totalAmount();
	}

}
