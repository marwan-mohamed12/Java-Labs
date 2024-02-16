public class Main {
	
	public static void main(String args[]) {
		
		String string1 = "Marwan";
		String string2 = "Mohamed";
		
		String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
		String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
		
		System.out.println("Longer: " + longer);
		System.out.println("First: " + first);
		
	}
	
}