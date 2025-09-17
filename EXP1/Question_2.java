import java.util.Scanner;
public class Question_2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the consumed units for each month");
		double units=0.00;
		for(int i=1;i<=12;i++)
		{
			System.out.print("Ente the price for "+i+" month ");
			units+=sc.nextDouble();
			
		}
		double avg=units/12;
		if(avg>500)
			System.out.println("⚠️High Consumption Alert");
		System.out.println("Your total consumed units is: "+units);
		System.out.println("Your average unit consumption is : " +avg);
	
	}
}