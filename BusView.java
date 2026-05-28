import java.util.Scanner;

class BusView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println("\n--- Bus Reservation Menu ---");
        System.out.println("1. Add Passenger");
        System.out.println("2. Display Passengers");
        System.out.println("3. Book Ticket");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Exit");
    }

    int getChoice() {

        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }

    int getId() {

        System.out.print("Enter ID: ");

        int id = sc.nextInt();
        sc.nextLine();

        return id;
    }

    String getName() {

        System.out.print("Enter Name: ");

        return sc.nextLine();
    }
}