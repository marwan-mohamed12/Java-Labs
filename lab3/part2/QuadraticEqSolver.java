import java.util.function.*;

class QuadraticEqSolver implements Function<QuadraticOperands, QuadraticRoots>{
	
	public QuadraticRoots apply(QuadraticOperands eq) {
		
		double determinant = eq.op2 * eq.op2 - 4 * eq.op1 * eq.op3;
		
		if (determinant > 0) {
			
			double root1 = (-eq.op2 + Math.sqrt(determinant)) / (2 * eq.op1);
			double root2 = (-eq.op2 - Math.sqrt(determinant)) / (2 * eq.op1);
			//System.out.println("Root1: " + root1 + ", Root2: " + root2);
			return new QuadraticRoots(root1, root2, false);
		
		} else if (determinant == 0) {
			
			double root = -eq.op2 / (2 * eq.op1);
			//System.out.println("Root: " + root);
			return new QuadraticRoots(root, root, false);
			
		} else {
			
			double real = -eq.op2 / (2 * eq.op1);
			double imaginary = Math.sqrt(-determinant) / (2 * eq.op1);
			//System.out.println("Real: " + real + ", Imaginary: " + imaginary);
			return new QuadraticRoots(real, imaginary, true);
		}
	
	}
	
}


