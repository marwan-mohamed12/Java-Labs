public class StringAlph {
	
	public static boolean isAlpha(String s, StringInterface c) {
			
		return c.applyFunc(s);
			
	}
	
	public static boolean checkStr(String s) {
		
		for (char c: s.toCharArray()) {
			
			if (!Character.isLetter(c)) {
				return false;
			}
			
		}
		
		return true;

	}
	
	
}