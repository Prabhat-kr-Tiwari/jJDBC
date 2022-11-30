package JDBC.CRUDOPERATION;

import java.sql.*;

public class Readdatafromdatabse {


    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/prabhat_database","root","");

        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM details");
        String userData = "";
        while (rs.next()){
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));System.out.println(rs.getString(4));
//            System.out.println(rs.getString(5));
            userData = rs.getInt(1) + " " + rs.getString(2);
            System.out.println(userData);


        }

    }
}
