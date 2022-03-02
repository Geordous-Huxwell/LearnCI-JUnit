

public class Calculator {

	public Calculator() {
	}
	/**
	 * Receives two double values and performs an action. If a is less than b, a*b, otherwise, a/b will be returned.
	 * @param a
	 * @param b
	 * @return the result of the action performed on and b.
	 * @throws ArithmeticException is b is 0;
	 */
	public double action(double a, double b) {
		double result = 0;
		if (a<b) {
			result = a * b;
		}else {
			try {
				result = a/b;
			} catch (ArithmeticException e) {
				System.out.print("error: Division by zero");
			}
			
		}
		System.out.print("Result: ");
		System.out.println(result);
		return result;
	}

}
