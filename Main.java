import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hostel_db",
                    "root",
                    "280905"
            );

            Scanner sc = new Scanner(System.in);

            // Calculate Total Hostel Fee
            String sumQuery = "SELECT SUM(fee) FROM HostelStudent";

            PreparedStatement ps = con.prepareStatement(sumQuery);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Total Hostel Fee: " + rs.getDouble(1));
            }

            // Delete Student
            System.out.print("Enter Student ID to Delete: ");
            int id = sc.nextInt();

            String deleteQuery =
                    "DELETE FROM HostelStudent WHERE student_id = ? AND fee > 0";

            PreparedStatement ps2 = con.prepareStatement(deleteQuery);

            ps2.setInt(1, id);

            int rows = ps2.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Deleted Successfully!");
            } else {
                System.out.println("Student Not Found or Fee Not Paid!");
            }

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}