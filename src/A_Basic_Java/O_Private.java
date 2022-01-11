package A_Basic_Java;

import java.util.Scanner;

public class O_Private {

	private double PrincipalAmount =4000;
	private double WidrwalAmount;
	
	private void widthraw() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter widhdwal Amount:");
		int w = s.nextInt();
		if(w<PrincipalAmount) {
			System.out.println("Please Collect the cash:" +w);
		}else {
			System.out.println("You don't have enough money");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O_Private op =new O_Private();
		//op.WidrwalAmount=500;
		op.widthraw();
	}

}
