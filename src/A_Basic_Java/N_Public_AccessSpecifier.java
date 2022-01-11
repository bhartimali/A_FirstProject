package A_Basic_Java;

public class N_Public_AccessSpecifier {
	
	public double totalAmount;
	public double LoanAmount;
	public int tenure;
	public double intrestRate;
	
	public void intrestCal() {
		totalAmount = LoanAmount*intrestRate*tenure/100;
		System.out.println("Total Amount is : "+totalAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N_Public_AccessSpecifier PA =new N_Public_AccessSpecifier();
		PA.intrestRate=0.5;
		PA.LoanAmount=100000;
		PA.tenure=5;
		PA.intrestCal();
	}

}
