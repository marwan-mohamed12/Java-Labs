java.util.regex.*;

public class Part3{
	public static void main(String args[]){
		if (args.length == 0) {
			System.out.println("No args Passed");
		} else {
			if (args.length == 2) {
				if (Pattern.matches("[0-9]", args[0])) {
					int num = Integer.parseInt(args[0]);
					for (int i = 0; i < num; i++) {
						System.out.println(args[1]);
					}
				} else {
					System.out.println("the first arg should be number");
				}
			} else {
				System.out.println("You Have to pass 2 args");
			} 
		}
	}
}