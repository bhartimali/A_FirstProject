package A_Basic_Java;

import java.util.Scanner;

public class F_DisionMakingStatements {

	public static void main(String[] args) {
		//if else
		String a="Testing";
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the any String:");
		String input = scan.nextLine();
		if (a.equalsIgnoreCase(input)) {
			System.out.println("String is matched");
		}else {
			System.out.println("String is not matched");
			//scan.close();
		}
		
		//integer
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int no = s.nextInt();
		if(no==1) {
			System.out.println("equal to 1");
		}else {
			System.out.println("not equal to 1");
			s.close();
		}
	}

}
