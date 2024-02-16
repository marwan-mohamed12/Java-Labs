import java.util.regex.*;

class IP {
	
	public static void main(String args[]) {
		
		if (args.length == 0) {
			System.out.println("Enter IP Address.");
			return;
		} 
		
		String ip = args[0];
		
		String regex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
		Pattern ipPattern = Pattern.compile(regex);
		Matcher matcher = ipPattern.matcher(ip);
		
		if (!matcher.matches()) {
			System.out.println("Not Valid IP");
			return;
		}
		
		System.out.println(ip);
		String[] ipDigits = ip.split("\\.");
		
		for (int i = 0; i < ipDigits.length; i++) {
			System.out.println(ipDigits[i]);
		}
		
	}
	
}

//192.168.0.1

//192.168.0.256