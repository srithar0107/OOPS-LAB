import java.util.*;
public class Question_9 {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Random random = new Random();
char small[]=
{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
'v','w','x','y','z'};
char capital[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
System.out.print("Enter the password length: ");
int length = sc.nextInt();
if (length<3)
{
System.out.println("Minimum length is 3 ");
return;
}
String result = "";
result += small[random.nextInt(small.length)];
result += capital[random.nextInt(capital.length)];
result += numbers[random.nextInt(numbers.length)];
	for (int i = 3; i < length; i++)
{
int choice = random.nextInt(3); // 0 for small, 1 for capital, 2 for
numbers
if (choice == 0)
{
result += small[random.nextInt(small.length)];
}
else if (choice == 1)
{
result += capital[random.nextInt(capital.length)];
}
else
{ // choice == 2
result += numbers[random.nextInt(numbers.length)];
}
}
System.out.println(result);
}
}


