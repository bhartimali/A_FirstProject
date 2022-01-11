package B_OOPS;

import A_Basic_Java.S_Polymorphism_Super;

public class E_Ploymorphism_Sub extends S_Polymorphism_Super{

	protected double side;
	
	@Override
	protected void area() {
		area = side*side;
		System.out.println("Area of the square is: "+area);
		super.area();
	}
	public static void main(String[] args) {

		E_Ploymorphism_Sub ep = new E_Ploymorphism_Sub();
		ep.side=20;
		ep.breath=4;
		ep.length=5;
		ep.area();

	}

}
