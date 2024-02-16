public class MathCalculator {
	
	public static void main(String args[]) {
		
		if (args.length == 0) {
		
			System.out.println("Please, Enter args values");
			
		} else {
			
			if (args.length < 4 && args.length > 4) {
				
				System.out.println("Only Three args");
				
			} else {
				
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				int num3 = Integer.parseInt(args[2]);
				int num4 = Integer.parseInt(args[3]);
				
				Calculations calc = new Calculations();
				
				try {
					
					System.out.println("Division: " + calc.divide(num1, num2));
					
					
				}catch(MathException e){
					
					System.out.println(e.getMessage());					
					
				} 
				
				try {
					
					System.out.println("Sqrt: " + calc.squareRoot(num3));
				
				} catch(MathException e) {
					
					System.out.println(e.getMessage());
				
				}
				
				try {
					
					System.out.println("Factorial: " + calc.factorial(num4));
				
				} catch(MathException e) {
					
					System.out.println(e.getMessage());
				
				} finally {
					
					System.out.println("Calculations Ended");
				
				}
				
			}
			
		}
		
	}
	
}