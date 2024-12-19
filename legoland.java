import java.util.Scanner;

public class legoland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalPrice = 0; 
        char anotherTicket = 'Y'; 
        int i=1;
        
        System.out.println("-----WELCOME TO LEGOLANDS THEME PARK-----");
        
        while (anotherTicket == 'Y' || anotherTicket == 'y') {
            System.out.println("\nChoose type of ticket for visitor " + i);
            System.out.println("*****************************************");
            System.out.println("1: 1 DAY COMBO TICKET (THEME PARK + WATER PARK)");
            System.out.println("2: 1 DAY THEME PARK TICKET");
            System.out.println("3: 1 DAY WATER PARK TICKET");
            System.out.println("*****************************************");
            
            System.out.print("Type:");
            int type = sc.nextInt();
            System.out.print("Age of visitor " + i + ":");
            int age = sc.nextInt();
            
            double price = 0; 
            
            if (type == 1) { 
                if (age >= 3 && age <= 11) {
                    price = 156;
                } else if (age >= 12 && age <= 60) {
                    price = 196;
                } else if (age < 3 || age > 60) {
                    price = 0;
                }
            } else if (type == 2) { 
                if (age >= 3 && age <= 11) {
                    price = 124;
                } else if (age >= 12 && age <= 60) {
                    price = 156;
                } else if (age < 3 || age > 60) {
                    price = 0;
                }
            } else if (type == 3) { 
                if (age >= 3 && age <= 11) {
                    price = 84;
                } else if (age >= 12 && age <= 60) {
                    price = 100;
                } else if (age < 3 || age > 60) {
                    price = 0;
                }
            } else{
                System.out.println("Invalid ticket type");
            }
            
           
            System.out.printf("TICKET PRICE FOR VISITOR " + i + " RM %.2f%n", price);
            totalPrice += price;
            i++;
            System.out.print("\nDo you want to calculate another ticket? [Y/N]: ");
            anotherTicket = sc.next().charAt(0);
        }
        
        System.out.printf("\nThe total ticket price is RM %.2f%n", totalPrice);
        
        System.out.print("Enter amount tendered: RM ");
        double tendered = sc.nextDouble();
        double balance = tendered - totalPrice;
        
        System.out.printf("Your balance is RM %.2f%n", balance);
        System.out.println("--------THANK YOU & ENJOY YOUR TIME!--------");
        
      
    }
}
