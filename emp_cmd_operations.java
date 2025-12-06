import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class emp_cmd_operations {

    public static void main(String[] args) throws Exception {

        //Step 0  Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");

        // Step 1: MySQL connection details
        String url = "jdbc:mysql://localhost:3306/"; // only server level
        String user = "root";  
        String pass = "root";

        // Step 2: connect first (server level)
        Connection con = DriverManager.getConnection(url, user, pass);

        // Step 3: create database if not exists
        String dbName = "EmpMgmntDb";
        Statement st = con.createStatement();
        st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
        System.out.println("Database created");

        con.close(); 


        // Step 4: switch connection now INTO that database
        con = DriverManager.getConnection(url + dbName, user, pass);

        // **important** — create NEW Statement here
        st = con.createStatement();
        // Step 5: create table if not exists
        String createTableQuery = "CREATE TABLE IF NOT EXISTS employee("
                + "id INT PRIMARY KEY,"
                + "name VARCHAR(50),"
                + "salary DOUBLE"
                + ")";
        st.executeUpdate(createTableQuery);
        System.out.println("Table created");

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // CRUD Menu loop
        menuLoop: while (true) {
            System.out.println("\n=== EMPLOYEE CRUD MENU ===");
            System.out.println("1. Insert Employee");
            System.out.println("2. Read All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: { // INSERT
                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name : ");
                    String name = sc.next();

                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();

                    PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setDouble(3, salary);

                    ps.executeUpdate();
                    System.out.println("Employee Inserted!");
                } break;

                case 2: { // READ
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");
                    ResultSet rs = ps.executeQuery();

                    System.out.println("ID\tNAME\tSALARY");
                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
                    }
                } break;

                case 3: { // UPDATE
                    System.out.print("Enter ID to Update : ");
                    int id = sc.nextInt();

                    System.out.print("Enter new Salary : ");
                    double salary = sc.nextDouble();

                    PreparedStatement ps = con.prepareStatement("UPDATE employee SET salary=? WHERE id=?");
                    ps.setDouble(1, salary);
                    ps.setInt(2, id);

                    ps.executeUpdate();
                    System.out.println("Salary Updated!");
                } break;

                case 4: { // DELETE
                    System.out.print("Enter ID to Delete : ");
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE id=?");
                    ps.setInt(1, id);

                    ps.executeUpdate();
                    System.out.println("Employee Deleted!");
                } break;

                case 5: { // EXIT
                    System.out.println("Exiting... Bye!");
                    break menuLoop;
                }

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        con.close();
        sc.close();
    }
}