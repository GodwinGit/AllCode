public class SumIntBool {

	public static void main(String[] args) {
		sumIntBool(3, 2, false);

	}

	public static int sumIntBool(int num1, int num2, boolean c) {
		int addIt = num1 + num2;
		int multiIt = num1 * num2;
		if (c == true) {
			System.out.println(addIt);
			return addIt;
		} else {
			System.out.println(multiIt);
			return multiIt;
		}
	}

}
