
public class Factorial {

	public static void main(String[] args) {
		System.out.println(calculateFactorial(5));
	}
	public static int calculateFactorial(int number){
	if(number == 0){
		return 1;
	}
	else {
		return number * calculateFactorial(number - 1);
	}

	}

}
