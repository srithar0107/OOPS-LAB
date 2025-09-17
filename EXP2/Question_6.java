import java.util.*;
public class Question_6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println("Enter the element at "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search element");
		int search=sc.nextInt();
		int count=0;
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				count++;
			}
		}
		System.out.println("Number found "+count+" times");
		
	}

}