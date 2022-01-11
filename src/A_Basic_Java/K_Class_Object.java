package A_Basic_Java;

//class is collection of similar type objects
//object is an instant of a class
//class is contain state and behavior
	class Animal{
		//state: global variables
		int legs;
		int eyes;
		String food;
		
		//behavior :method
		public void display() {
			System.out.println("Number of legs: "+legs);
			System.out.println("Number of eyes: "+eyes);
			System.out.println("type of food: "+food);
		}
	}
	public class K_Class_Object {
	public static void main(String[] args) {
		Animal cow = new Animal(); //Instantiation
		cow.eyes=2;
		cow.legs=2;
		cow.food="Veggi";
		cow.display();
	}

}
