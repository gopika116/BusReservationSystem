public class Main {

    public static void main(String[] args) {

        BusController controller =
                new BusController();

        BusView view =
                new BusView();

        while (true) {

            view.showMenu();

            int choice =
                    view.getChoice();

            switch (choice) {

                case 1:

                    int id = view.getId();
                    String name = view.getName();

                    controller.addPassenger(id, name);

                    break;

                case 2:

                    controller.displayPassengers();

                    break;

                case 3:

                    String bookName = view.getName();

                    controller.bookTicket(bookName);

                    break;

                case 4:

                    String cancelName = view.getName();

                    controller.cancelTicket(cancelName);

                    break;

                case 5:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}