package B_OOPS;

import A_Basic_Java.V_Abstract_SuperClass;

public class G_Abstrct_SubClass extends V_Abstract_SuperClass{

	public void home() {
		System.out.println("This is home page");
	}
	public void index() {
		System.out.println("This is Index page");
	}
	public void composed() {
		System.out.println("This is composed page");
	}
	public static void main(String[] args) {
		G_Abstrct_SubClass ga = new G_Abstrct_SubClass();
		ga.uname="navin";
		ga.upass="pass";
		ga.login();
		ga.home();
		ga.index();
		ga.composed();

	}

}
