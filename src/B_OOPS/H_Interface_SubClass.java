package B_OOPS;

import A_Basic_Java.W_Interface_Super;

public class H_Interface_SubClass implements W_Interface_Super {

	public void home(){
		System.out.println("<<........Home page.........>>");
	}
	public void index() {
		System.out.println("<<........index page.........>>");
	}
	public void composed() {
		System.out.println("<<........composed page.........>>");
	}
	public void contacts() {
		System.out.println("<<........contacts page.........>>");
	}
	public static void main(String[] args) {
		H_Interface_SubClass hi = new H_Interface_SubClass();
		hi.home();
		hi.index();
		hi.composed();
		hi.contacts();

	}
	

}
