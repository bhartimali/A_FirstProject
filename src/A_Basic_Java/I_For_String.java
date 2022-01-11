package A_Basic_Java;

public class I_For_String {

	public static void main(String[] args) {
		// Dynamic Array Declaration
		String[] fruits = { "mango", "banana", "papaya" };

		for (int i = 0; i < fruits.length; i++) {
			String fname = fruits[i];
			System.out.println("" + fname);

		}
		// Static Array Declaration
		int[] OddNo = new int[3];
		OddNo[0] = 1;
		OddNo[1] = 2;
		OddNo[2] = 3;
		for (int j = 0; j < 3; j++) {
			int ono = OddNo[j];
			System.out.println("Odd numbers are:" + ono);
		}
	}

}
