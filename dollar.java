package converter;
import java.util.*;
public class dollar {
	public void currencyconvert(){
		double inr,usd,doll;
		System.out.println("\nDOLLAR TO INR");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter INR to convert int USD:");
		inr =in.nextDouble();
		System.out.print("Enter Current USD rate : ");
		doll=in.nextDouble();
		usd=inr/doll;
		System.out.println("\nINR = "+inr+"\nUSD = "+usd);
	}
	public void distanceconvert(){
		double km,meters,miles;
		System.out.println("Distance converter");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the distance in meters : ");
		meters=in.nextDouble();
		km=meters/1000;
		miles=meters/1600;
		System.out.println("\nMeters = "+meters+"\nKM = "+km+"Miles = "+miles);
	}
	public void timeconvert(){
		double min,hour,sec;
		System.out.println("Time COnverter");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the time in hours : ");
		hour=in.nextDouble;
		min=hour*60;
		sec=hour*3600;
		System.out.prinln("\nHours = "+hour+"\nMinutes = "+min+"\nSeconds = "+sec);
	}
}
