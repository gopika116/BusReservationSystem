import java.util.Scanner;

class BusView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println("\n--- Bus Reservation Menu ---");
        System.out.println("1. Display Passengers");
        System.out.println("2. Search Passenger");
        System.out.println("3. Book Ticket");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Exit");
    }

    int getChoice() {

        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    String getName(String msg) {

        sc.nextLine();
        System.out.print(msg);
        return sc.nextLine();
    }

    void displayPassengers(Passenger[] passengers, int count) {

        System.out.println("\nPassenger List:");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    passengers[i].id + " - " +
                    passengers[i].name + " - " +
                    (passengers[i].booked ? "Booked" : "Not Booked"));
        }
    }

    void showMessage(String msg) {
        System.out.println(msg);
    }
}