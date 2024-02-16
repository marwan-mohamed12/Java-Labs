import java.util.regex.*;

class TemperaturePract {

	public static void main(String args[]){
		
		if (args.length == 0) {
			System.out.println("Please Enter Temperature Degree.");
			return;
		}

		String centigradeTemp = args[0];
		
		String regex = "-?\\d+(\\.\\d+)?";
		Pattern ipPattern = Pattern.compile(regex);
		Matcher matcher = ipPattern.matcher(centigradeTemp);
		
		if (!matcher.matches()) {
			System.out.println("Not Valid Temperature Degree");
			return;
		}
		
		Double centigradeTempDouble = Double.parseDouble(centigradeTemp);
		
		Temperature temp = new Temperature();
		Double fahrenheitTemp = temp.convertCenigradeToFahrenheit(centigradeTempDouble);
		System.out.println("Temperature in fahrenheit:  " + fahrenheitTemp);
	}

}