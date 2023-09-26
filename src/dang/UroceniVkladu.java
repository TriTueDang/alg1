package dang;
import java.util.Scanner;

public class UroceniVkladu {

	public static void main(String[] args) {
		// uloha12
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Starting capital (K0) in Kc: ");
		int k0 = obj.nextInt();
		
		System.out.println("Interest (u): ");
		double u = obj.nextDouble();

		System.out.println("Number of years (n): ");
		int n = obj.nextInt();
		
		System.out.println("Interest (m): ");
		int m = obj.nextInt();
		
		double kn = k0 * Math.pow((1 + u/m), n*m);
		
		System.out.format("The total is %.2f Kc.\n", kn);
	}

}
