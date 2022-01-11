package A_Basic_Java;

class Loan{
	double loanAmount;
	double TotalAmount;
	double intrestRate;
	int tenure;
	String TypeLoan;
	
	public void intrestCal() {
		TotalAmount = loanAmount*intrestRate*tenure/100;
		System.out.println("Intrest amount is: "+TotalAmount);
	}
}
public class L_PracticeExample {

	public static void main(String[] args) {
		
		Loan StudentLoan = new Loan();
		
		StudentLoan.TypeLoan="Student Loan";
		StudentLoan.loanAmount=100000;
		StudentLoan.tenure=5;
		StudentLoan.intrestRate=0.5;
		
		StudentLoan.intrestCal();

	}

}
