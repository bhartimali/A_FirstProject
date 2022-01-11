package A_Basic_Java;

public class D_LogicalOperators {

	public static void main(String[] args) {
		//Logical Operator: &&, ||, !
		boolean a = true, b=false, c=true, d= false;
		System.out.println("True && True:"+(a&&c)); //true
		System.out.println("True && false:"+(a&&b)); //false
		System.out.println("false && True:"+(b&&a)); //false
		System.out.println("false && false:"+(b&&d)); //false
		
		System.out.println("True && True:"+(a||c)); //true
		System.out.println("True && false:"+(a||b)); //true
		System.out.println("false && True:"+(b||a)); //true
		System.out.println("false && false:"+(b||d)); //false
		
		System.out.println("!a:"+(!a)); //false
		System.out.println("!b:"+(!b)); //true

	}

}
