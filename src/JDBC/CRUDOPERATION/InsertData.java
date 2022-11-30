package JDBC.CRUDOPERATION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        final String url = "jdbc:mysql://localhost/prabhat_database";
//        final String url = "jdbc:mysql:// localhost:3306/org";
        final String userName = "root";
        final String password = "";
        final String query = "INSERT INTO student value (?, ?, ? ,?, ?, ?, ?) ";
//        final String query = "INSERT INTO student values (?, ?, ?, ?)";
        System.out.println("Enter the id");
        int id = sc.nextInt();
        System.out.println("Enter the course id");

        int courseid = sc.nextInt();
        System.out.println("Enter the course fee");
        int fees = sc.nextInt();
        System.out.println("Enter the course name");
        String CourseName = sc.next();
        System.out.println("Enter the stream");
        String stream = sc.next();
        System.out.println("Enter the parents name");
        String parentsname = sc.next();
        System.out.println("Enter the address");
        String Address = sc.next();
        Connection con = DriverManager.getConnection(url, userName, password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, CourseName);
        ps.setString(3, stream);
        ps.setString(4, Address);
        ps.setInt(5, courseid);
        ps.setInt(6, fees);
        ps.setString(7, parentsname);

        int rowsAffected = ps.executeUpdate();

        System.out.println(rowsAffected);

        con.close();
        ps.close();
    }
}
