package A_Basic_Java;

public class J_Loops {

	public static void main(String[] args) {
		// Loops: while, do while,Enhanced
		int i =1;
		while(i<4) {
			i++;
			System.out.println("value of i is:(while loop): "+i);
		}
		System.out.println("Do while loop............");
		//do while loop
		int j=1;
		do {
			j++;
			System.out.println("value of j is(do while loop): "+j);
		}while(j<5);
		
		System.out.println("Break Statement............");
		int k=0;
		while(k<6) {
			k++;
			System.out.println("Break Statement value is: "+k);
			if(k==3) {
				break;
			}
		}
		System.out.println("Enhanced loop...............");
		String[] fruits= {"mango","papaya","orange"};
		for(String fname:fruits) {
			System.out.println("Enhanced For loop array is: "+fname);
		}
	}

}
