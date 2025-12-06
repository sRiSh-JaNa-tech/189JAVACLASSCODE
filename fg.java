public class fg {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "admin";
        String sql = "INSERT INTO teachers(emp_no, name) VALUES(?, ?)";

        try (java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);
             java.sql.PreparedStatement ps = conn.prepareStatement(sql)) {

            // set parameters
            ps.setInt(1, 1001);
            ps.setString(2, "John Doe");

            int affected = ps.executeUpdate();
            System.out.println(affected + " row(s) inserted.");

        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
