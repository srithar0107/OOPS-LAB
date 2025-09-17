import java.util.Scanner;


class Cake {
    String name;
    String flavor;
    double price;

    
    Cake(String name, String flavor, double price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }


    double CalculatePrice() {
        return price;
    }

    void displayDetails() {
        System.out.println("Cake Name: " + name);
        System.out.println("Flavor: " + flavor);
        System.out.println("Base Price: " + price);
    }
}


class OrderCake extends Cake {
    double weight; 

    OrderCake(String name, String flavor, double price, double weight) {
        super(name, flavor, price);
        this.weight = weight;
    }

  
    double CalculatePrice() {
        return price * weight;
    }

  
    void displayDetails() {
        super.displayDetails();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Total Price: " + CalculatePrice());
        System.out.println("--------------------------------");
    }
}


class ReadyMadeCake extends Cake {
    int quantity;

    ReadyMadeCake(String name, String flavor, double price, int quantity) {
        super(name, flavor, price);
        this.quantity = quantity;
    }

   
    double CalculatePrice() {
        return price * quantity;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + CalculatePrice());
        System.out.println("--------------------------------");
    }
}


public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Cake Shop Menu ---");
            System.out.println("1. Order Cake (by weight)");
            System.out.println("2. Ready-Made Cake (by quantity)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); 
                System.out.print("Enter Cake Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Flavor: ");
                String flavor = sc.nextLine();
                System.out.print("Enter Price per kg: ");
                double price = sc.nextDouble();
                System.out.print("Enter Weight (kg): ");
                double weight = sc.nextDouble();

                Cake orderCake = new OrderCake(name, flavor, price, weight); // polymorphism
                orderCake.displayDetails();

            } else if (choice == 2) {
                sc.nextLine(); 
                System.out.print("Enter Cake Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Flavor: ");
                String flavor = sc.nextLine();
                System.out.print("Enter Price per piece: ");
                double price = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                Cake readyCake = new ReadyMadeCake(name, flavor, price, qty); 
                readyCake.displayDetails();

            } else if (choice == 3) {
                System.out.println("Exiting... Thank you for visiting Cake Shop!");
            } else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}