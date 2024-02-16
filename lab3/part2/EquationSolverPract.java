class EquationSolverPract {
	
	public static void main (String args[]) {
		
		if (args.length < 3){
			System.out.println("You have to enter 3 args");
		} else {
			QuadraticEqSolver solver = new QuadraticEqSolver();
			QuadraticRoots roots = solver.apply(new QuadraticOperands(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2])));
			System.out.println(roots.toString());
		}
		
	}
	
}