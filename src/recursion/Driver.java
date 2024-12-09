package recursion;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (true) {
			RationalNumber frac = new RationalNumber();
			System.out.print("Enter a positive, whole numerator: ");
			frac.setNumerator(input.nextInt());
			System.out.print("Enter a positive, whole denominator: ");
			frac.setDenominator(input.nextInt());
			System.out.print("The fraction ");
			System.out.print(frac.getNumerator());
			System.out.print("/");
			System.out.print(frac.getDenominator());
			System.out.print(" can be reduced to ");
			int gcd = frac.factor();
			System.out.print(frac.getNumerator());
			System.out.print("/");
			System.out.print(frac.getDenominator());
			System.out.print(" by using the Grated Common Denominator, ");
			System.out.print(gcd);
			System.out.print("!");
			System.out.println("\n\n");
		}
	}
}
