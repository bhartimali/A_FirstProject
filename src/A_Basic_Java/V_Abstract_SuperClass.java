package A_Basic_Java;

public abstract class V_Abstract_SuperClass {

	protected String uname;
	protected String upass;
	
	public void login() {
		String username = "navin";
		String password="pass";
		if(uname.equalsIgnoreCase(username)&& upass==password) {
			System.out.println("Welcome to home page...");
		}else {
			System.out.println("Invalid login Id and pass...");
		}
	}
	public abstract void home();
	public abstract void index();
	public abstract void composed();
	
	public static void main(String[] args) {
	
		//V_Abstract_SuperClass vs = new V_Abstract_SuperClass();

	}

}
