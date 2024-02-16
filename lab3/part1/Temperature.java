class Temperature implements TempConverter<Double,Double> {

	@Override
	public Double convertCenigradeToFahrenheit(Double temp) {
		return (temp * 1.8) + 32;
	}
	
}