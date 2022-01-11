package A_Basic_Java;

public class R_Super_Inheritance {

	protected double basicFare=10;
	protected double farePerkm =4;
	protected double totalFare;
	protected int side;
	
	public R_Super_Inheritance() {
		System.out.println("Default super class constructor: Basic fare for  metro is: "+basicFare);
	}
	public R_Super_Inheritance(int km) {
		if(km>3) {
			totalFare=basicFare+farePerkm*(km-3);
			System.out.println("single peramieterised constructor :"+totalFare);
		}else {
			totalFare=basicFare;
			System.out.println("single peramieterised constructor :"+totalFare);
		}
	}
	protected static void area(int side) {
		int area = side*side;
		System.out.println("Area of the square is: "+area);
	}
	protected void perimeter(int l, int b) {
		int perimeter = 2*(l+b);
		System.out.println("perimeter of sqare is: "+perimeter);
	}
	public static void main(String[] args) {
		
		R_Super_Inheritance r1 = new R_Super_Inheritance();
		
		R_Super_Inheritance r2 = new R_Super_Inheritance(15);
		
		area(10);
		
		r2.perimeter(4, 4);

	}

}
