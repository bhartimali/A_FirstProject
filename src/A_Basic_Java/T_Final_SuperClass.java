package A_Basic_Java;

public   class  T_Final_SuperClass {

	protected final double pi=3.14;
	
	protected final void display() {
		//if we declare variable as final we cannot change the value of this variable
		//pi=3.15;
		System.out.println("We cannot change value of final variable: "+pi);
	}
	public static void main(String[] args) {
		T_Final_SuperClass TF = new T_Final_SuperClass();
		TF.display();

	}

}
