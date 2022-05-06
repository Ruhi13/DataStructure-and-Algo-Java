package ArraysDS;

import java.util.Scanner;

//Project to calculate average temperature and days above avg temperature
public class avgTemperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of days : ");
		int days=sc.nextInt();
		double temp[]=new double[days];
		int sum=0;
		for(int i=0;i<days;i++) {
			System.out.print("Day" +(i+1)+"'s high temp: ");
			temp[i]=sc.nextDouble();
			sum+=temp[i];
		}
		double avg=sum/days;
		int above=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>avg) {
				above++;
			}
				
		}
		System.out.println();
		System.out.println("Average temp :"+avg);
		System.out.println(above+ " day(s) above average temp");

	}

}
