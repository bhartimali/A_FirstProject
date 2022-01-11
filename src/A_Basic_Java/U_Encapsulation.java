package A_Basic_Java;

public class U_Encapsulation {

	//gloabl variables
	private String username;
	private String password;
	
	private void setUsername(String uname) {
		username = uname;
		System.out.println("User has set the name");
	}
	private String getUsername() {
		System.out.println("User get the name");
		return username;
	}
	private void setpassword(String upass) {
		password = upass;
		System.out.println("User has set the name");
	}
	private String getPassword() {
		System.out.println("User get the name");
		return password;
	}
	public void login() {
		String Uname="navin";
		String Upass="pass";
		
		if(Uname.equalsIgnoreCase(username) && Upass==password) {
			System.out.println("welcome to the Home Page");
		}else {
			System.out.println("Invalid Creadiantias..Please Enter Valid Username & password");
		}
	}
	public static void main(String[] args) {
		
		U_Encapsulation UE = new U_Encapsulation();
		
		UE.setUsername("Navin");
		UE.getUsername();
		UE.setpassword("pass");
		UE.getPassword();
		UE.login();
	}

}
