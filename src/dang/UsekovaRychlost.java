package dang;
import java.util.Scanner;
public class UsekovaRychlost {

	public static void main(String[] args) {
		// Úlohy02, úloha9
		Scanner objInput = new Scanner (System.in);
		
		System.out.println("Max velocity (km/h): ");
		int maxVelocity = objInput.nextInt();
		System.out.println("Distance (km): ");
		int distance = objInput.nextInt();
		
		
		System.out.println("Starting time (hh mm ss): ");
		int hourStart = objInput.nextInt();
		int minStart = objInput.nextInt();
		int secStart = objInput.nextInt();
		
		
		System.out.println("End time (hh mm ss): ");
		int hourEnd = objInput.nextInt();
		int minEnd = objInput.nextInt();
		int secEnd = objInput.nextInt();
	
		int startTime = hourStart*3600 + minStart*60 + secStart;
		int endTime = hourEnd*3600 + minEnd*60 + secEnd;
		double timeDiff = (endTime - startTime) / 3600.0;
		
		double averageVelocity = distance / timeDiff;
		double velocityDiff = (maxVelocity > averageVelocity) ? 0 : (averageVelocity - maxVelocity);
		System.out.format("The average velocity is %.2f km/h and the average velocity is %.2f km/h higher than the max velocity.\n", averageVelocity, velocityDiff);
	}

}
