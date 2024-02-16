public class Calculations {
	
	public int divide(int num1, int num2) throws MathException {
		
		if (num2 == 0) {
			throw new MathException("You can't divide by zero");
		}
		
		return num1 / num2;
	}
	
	public double squareRoot(int num) throws MathException {
		if (num < 0) {
			throw new MathException("You can't get the squareRoot of negative number");
		}
		
		return Math.sqrt(num);
	}
	
	public int factorial(int num) throws MathException {
		if (num < 0) {
			throw new MathException("You can't get the factorial of negative number");
		}else if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}
	
}