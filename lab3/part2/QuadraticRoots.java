class QuadraticRoots {
	
	double root1;
	double root2;
	boolean isComplex;
	
	public QuadraticRoots(double r1, double r2, boolean isComplex) {
		
		root1 = r1;
		root2 = r2;
		this.isComplex = isComplex;
		
	}
	
	public String toString() {
		
		if (isComplex) {
			return "Real: " + root1 + ", Imaginary: " + root2;
		} else {
			return "Root1: " + root1 + ", Root2: " + root2;
		}
	}
	
}