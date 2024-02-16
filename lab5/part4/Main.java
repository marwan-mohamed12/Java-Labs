public class Main {
	
	public static void main(String args[]) {
		String str = "Marwan123";
		boolean check = StringAlph.isAlpha(str, StringAlph::checkStr);
		System.out.println("Check: " + check);
	}
	
}