import java.math.BigDecimal;

public class Main {
	
	public static void main(String args[]){
		
		Complex<BigDecimal> c = new Complex(new BigDecimal(2), new BigDecimal(3));
		
		Complex<BigDecimal> addition = c.addComplex(new Complex<BigDecimal>(new BigDecimal(4),new BigDecimal(5)));
		System.out.println("Real: " + addition.getReal() + ", Img: " + addition.getImg());
		
		Complex<BigDecimal> subtract = c.subComplex(new Complex<BigDecimal>(new BigDecimal(4) , new BigDecimal(5)));
		System.out.println("Real: " + subtract.getReal() + ", Img: " + subtract.getImg());

		Complex<BigDecimal> times = c.MultComplex(new Complex<BigDecimal>(new BigDecimal(4) , new BigDecimal(5)));
		System.out.println("Real: " + times.getReal() + ", Img: " + times.getImg());

		
	}
	
}