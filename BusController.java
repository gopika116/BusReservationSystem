class BusController {

    Passenger[] passengers;
    int count;

    BusController(int size) {

        passengers = new Passenger[size];
        count = 0;
    }

    void addPassenger(int id, String name) {

        passengers[count++] = new Passenger(id, name);
    }

    Passenger[] getPassengers() {
        return passengers;
    }

    int getCount() {
        return count;
    }

    Passenger findPassenger(String name) {

        for (int i = 0; i < count; i++) {

            if (passengers[i].name.equalsIgnoreCase(name)) {
                return passengers[i];
            }
        }

        return null;
    }

    String bookTicket(String name) {

        Passenger p = findPassenger(name);

        if (p == null)
            return "Passenger Not Found";

        if (!p.booked) {

            p.booked = true;
            return "Ticket Booked Successfully";
        }

        return "Ticket Already Booked";
    }

    String cancelTicket(String name) {

        Passenger p = findPassenger(name);

        if (p == null)
            return "Passenger Not Found";

        if (p.booked) {

            p.booked = false;
            return "Ticket Cancelled Successfully";
        }

        return "Ticket Not Booked";
    }
}