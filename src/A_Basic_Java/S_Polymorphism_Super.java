package A_Basic_Java;

public class S_Polymorphism_Super {

	protected double area;
	protected double length;
	protected double breath;
	
	protected void area() {
		area = length*breath;
		System.out.println("Area of rectangle is: "+area);
	}
	public static void main(String[] args) {
		
		S_Polymorphism_Super sp = new S_Polymorphism_Super();
		sp.length=20;
		sp.breath=10;
		sp.area();
	}

}
