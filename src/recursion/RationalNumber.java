package recursion;

public class RationalNumber {
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int newNumerator) {
		if (newNumerator > 0) {
			numerator = newNumerator;
		}
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int newDenominator) {
		if (newDenominator > 0) {
			denominator = newDenominator;
		}
	}
	
	public int factor() {
		int gcd;
		if (numerator >= denominator) {
			gcd = getGCD(numerator, denominator);
		} else {
			gcd = getGCD(denominator, numerator);
		}
		setNumerator(numerator / gcd);
		setDenominator(denominator / gcd);
		return gcd;
	}
	
	public int getGCD(int a, int b) {
		int remainder = a % b;
		if (remainder <= 0) {
			return b;
		} else {
			return getGCD(b, remainder);
		}
	}
}
