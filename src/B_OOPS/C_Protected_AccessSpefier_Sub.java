package B_OOPS;
import A_Basic_Java.N_Public_AccessSpecifier;
public class C_Protected_AccessSpefier_Sub extends N_Public_AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Protected_AccessSpefier_Sub pp =new C_Protected_AccessSpefier_Sub();
		pp.intrestRate=0.5;
		pp.LoanAmount=100000;
		pp.tenure=5;
		pp.intrestCal();
	}

}
