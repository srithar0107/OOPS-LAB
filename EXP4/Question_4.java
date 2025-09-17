import java.util.Scanner;

class Patient {
    int patientID;
    String name;
    int age;
    String disease;
    double dailyCharge;
    int daysAdmitted;

    
    Patient(int patientID, String name, int age, String disease, double dailyCharge, int daysAdmitted) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

   
    double calculateBill() {
        double total = dailyCharge * daysAdmitted;
        double tax = total * 0.05; 
        return total + tax;
    }

  
    void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Daily Room Charge: " + dailyCharge);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Total Bill (with 5% tax): " + calculateBill());
        System.out.println("-----------------------------------");
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter details for Patient 1:");
        System.out.print("Patient ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Disease: ");
        String disease1 = sc.nextLine();
        System.out.print("Daily Room Charge: ");
        double charge1 = sc.nextDouble();
        System.out.print("Days Admitted: ");
        int days1 = sc.nextInt();



        Patient p1 = new Patient(id1, name1, age1, disease1, charge1, days1);

        System.out.println("\nEnter details for Patient 2:");
        System.out.print("Patient ID: ");
        int id2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Disease: ");
        String disease2 = sc.nextLine();
        System.out.print("Daily Room Charge: ");
        double charge2 = sc.nextDouble();
        System.out.print("Days Admitted: ");
        int days2 = sc.nextInt();

       
        Patient p2 = new Patient(id2, name2, age2, disease2, charge2, days2);

     
        System.out.println("\n--- Patient Bill Details ---");
        p1.displayDetails();
        p2.displayDetails();

        sc.close();
    }
}