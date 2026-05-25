public class Main {

    public static void main(String[] args) {

        BusController controller = new BusController(10);
        BusView view = new BusView();

        controller.addPassenger(1, "Gopi");
        controller.addPassenger(2, "Ram");
        controller.addPassenger(3, "Priya");

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    view.displayPassengers(
                            controller.getPassengers(),
                            controller.getCount());

                    break;

                case 2:

                    String search = view.getName("Enter passenger name: ");

                    if (controller.findPassenger(search) != null)
                        view.showMessage("Passenger Found");
                    else
                        view.showMessage("Passenger Not Found");

                    break;

                case 3:

                    String book = view.getName("Enter passenger name: ");

                    view.showMessage(
                            controller.bookTicket(book));

                    break;

                case 4:

                    String cancel = view.getName("Enter passenger name: ");

                    view.showMessage(
                            controller.cancelTicket(cancel));

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