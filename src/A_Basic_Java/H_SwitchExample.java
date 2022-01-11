package A_Basic_Java;

import java.util.Scanner;

public class H_SwitchExample {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any month number from 1 to 12");
		int month = s.nextInt();
		switch(month) {
		case 1:
			System.out.println("first month of the year is JAN");
			break;
		case 2:
			System.out.println("2nd month of the year is FAB");
			break;
		case 3:
			System.out.println("3rd month of the year is MAR");
			break;
		case 4:
			System.out.println("4th month of the year is APR");
			break;
		case 5:
			System.out.println("5th month of the year is MAY");
			break;
		case 6:
			System.out.println("6th month of the year is JUN");
			break;
		case 7:
			System.out.println("7th month of the year is JULY");
			break;
		case 8:
			System.out.println("8th month of the year is AUG");
			break;
		case 9:
			System.out.println("9th month of the year is SEPT");
			break;
		case 10:
			System.out.println("10th month of the year is OCT");
			break;
		case 11:
			System.out.println("11th month of the year is NOV");
			break;
		case 12:
			System.out.println("12th month of the year is DEC");
			break;
		default:
			System.out.println("DEFAULT month!!!!");
			break;
		}

	}

}
