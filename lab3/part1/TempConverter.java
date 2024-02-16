@FunctionalInterface

public interface TempConverter<T,R> {
	
	public R convertCenigradeToFahrenheit(T t);
	
}