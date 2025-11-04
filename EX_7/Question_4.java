import java.util.Scanner;
class InvalidNameException extends Exception 
{
    public InvalidNameException(String msg) 
    {
        super(msg);
    }
}

class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class Question_4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            for (int i = 0; i < name.length(); i++) 
            {
                if (Character.isDigit(name.charAt(i)))
                {
                    throw new InvalidNameException("Name cannot contain numbers.");
                }
            }

            System.out.print("Enter Employee Age : ");
            int age = sc.nextInt();

            if (age > 50) 
            {
                throw new InvalidAgeException("Age must not exceed 50.");
            }

            System.out.println("\n--- Employee Created Successfully ---");
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Age  : " + age);

        } catch (InvalidNameException e) 
        {
            System.out.println("Invalid Name Error: " + e.getMessage());
        } catch (InvalidAgeException e) 
        {
            System.out.println("Invalid Age Error: " + e.getMessage());
        } finally 
        {
            System.out.println("\nProgram Execution Completed.");
            sc.close();
        }
    }
}