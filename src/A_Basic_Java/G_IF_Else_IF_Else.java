package A_Basic_Java;

import java.util.Scanner;

public class G_IF_Else_IF_Else {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the week no bet 1 to 7:");
		int week = s.nextInt();
		if(week == 1) {
			System.out.println("First day of the week is Sunday");
		}else if(week == 2) {
			System.out.println("First day of the week is Monday");
		}else if(week == 3) {
			System.out.println("First day of the week is Tuesday");
		}else if(week == 4) {
			System.out.println("First day of the week is Wednesday");
		}else if(week == 5) {
			System.out.println("First day of the week is Thusday");
		}else if(week == 6) {
			System.out.println("First day of the week is Friday");
		}else if(week == 7) {
			System.out.println("First day of the week is Saturday");
		}else {
			System.out.println("There is no week day!!!");
			s.close();
		}
	}

}
