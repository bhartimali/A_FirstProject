package B_OOPS;
import A_Basic_Java.N_Public_AccessSpecifier;
public class A_Public_AccessSpecifier_Sub {

	public static void main(String[] args) {
		N_Public_AccessSpecifier np =new N_Public_AccessSpecifier();
		np.intrestRate=0.5;
		np.tenure=2;
		np.LoanAmount=500000;
		np.intrestCal();
	}

}
