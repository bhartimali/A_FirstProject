package A_Basic_Java;

public class B_Arithmetic_Operator {

	public static void main(String[] args) {
		//Assignment Opeartor : =,+=,-=
		int d=10,e=20;
		d+=6;
		System.out.println("assignment openator += is: "+d);
		e-=6;
		System.out.println("assignment openator -= is: "+e);
		// Arithmatic Operator
		int a=20, b=30, c;
		c=a+b;
		System.out.println("Addition of a and b is: "+c);
		c=a-b;
		System.out.println("Substraction of a and b is: "+c);
		c=a*b;
		System.out.println("Mul of a and b is: "+c);
		c=a/b;
		System.out.println("Div of a and b is: "+c);
		c=a%b;
		System.out.println("Modulo of a and b is: "+c);
		a++;
		System.out.println("Increment of a  is: "+a);
		b--;
		System.out.println("decremnt of b  is: "+b);
	}

}
