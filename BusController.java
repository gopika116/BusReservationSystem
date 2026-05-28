import java.sql.*;

class BusController {

    Connection con;

    BusController() {

        con = DBConnection.getConnection();
    }

    void addPassenger(int id, String name) {

        try {

            String query =
                    "INSERT INTO passengers VALUES (?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setBoolean(3, false);

            ps.executeUpdate();

            System.out.println("Passenger Added");

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    void displayPassengers() {

        try {

            String query = "SELECT * FROM passengers";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            System.out.println("\nPassenger List:");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("name") + " - " +
                        (rs.getBoolean("booked")
                                ? "Booked"
                                : "Not Booked"));
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    void bookTicket(String name) {

        try {

            String query =
                    "UPDATE passengers SET booked = true WHERE name=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Ticket Booked Successfully");
            else
                System.out.println("Passenger Not Found");

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    void cancelTicket(String name) {

        try {

            String query =
                    "UPDATE passengers SET booked = false WHERE name=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Ticket Cancelled Successfully");
            else
                System.out.println("Passenger Not Found");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}