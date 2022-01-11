package A_Basic_Java;

public class P_Protected_AccessSpecifier {
	
	//gloabal varibales
	public double totalAmount;
	public double LoanAmount;
	public int tenure;
	public double intrestRate;
	
	public void IntrestCal() {
		totalAmount = LoanAmount*tenure*intrestRate/100;
		System.out.println("Total Amount is: "+totalAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Protected_AccessSpecifier pp =new P_Protected_AccessSpecifier();
		pp.intrestRate=0.5;
		pp.LoanAmount=500000;
		pp.tenure=2;
		pp.IntrestCal();
	}

}
