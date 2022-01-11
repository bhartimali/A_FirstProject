package B_OOPS;

import A_Basic_Java.R_Super_Inheritance;

public class D_Sub_Inheritance extends R_Super_Inheritance {

	protected double basicFare = 10;
	protected double fareperKm = 2;
	protected double totalFare;

	public D_Sub_Inheritance() {
		super();
		System.out.println("Deafult constructor of sub class");
		
	}

	public D_Sub_Inheritance(int km) {
		if (km > 2) {
			totalFare = basicFare + fareperKm * (km - 2);
			System.out.println("Total fare foe bus is: " + totalFare);
		} else {
			totalFare = basicFare;
			System.out.println("Total fare foe bus is: " + totalFare);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_Sub_Inheritance s1 = new D_Sub_Inheritance();
		D_Sub_Inheritance s2 = new D_Sub_Inheritance(12);
		area(30);
	}

}
