package dang;
import java.util.Scanner;
public class PrevodSekund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  objTime = new Scanner(System.in);
		// First task
			// hours, minutes and seconds into seconds only
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		System.out.println("Enter hours: ");
		hour  = objTime.nextInt();
		
		System.out.println("Enter minutes: ");
		min  = objTime.nextInt();
		
		System.out.println("Enter seconds: ");
		sec  = objTime.nextInt();
	
		int secTotal = 0;
		secTotal = hour*3600 + min*60 + sec;
		System.out.println("Total seconds: " + secTotal);
		
		// Second task
			// seconds convert into a HH:MM:SS format
		int secConvert = 0;
		System.out.println("Enter seconds to convert into HH:MM:SS format: ");
		secConvert = objTime.nextInt();
		
		int hourFormat = secConvert / 3600;
		secConvert -= hourFormat * 3600; 
		
		int minFormat = secConvert / 60;
		secConvert -= minFormat * 60;
		
		System.out.format("%02d:%02d:%02d", hourFormat, minFormat, secConvert);
		

	}

}
