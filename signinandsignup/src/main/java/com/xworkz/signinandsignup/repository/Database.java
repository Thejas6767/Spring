package com.xworkz.signinandsignup.repository;

import com.xworkz.signinandsignup.dto.SignUpDto; // Essential Import
import org.springframework.stereotype.Repository;
import java.sql.*;

@Repository
public class Database {
    @Repository
    public class Database{

        // Define these at the CLASS level (Fields)
        private String url = "jdbc:mysql://localhost:3306/loginpage_db";
        private String user = "root";
        private String pass = "root";

        public boolean save(SignUpDto dto) {
            String query = "insert into signup_tb values (?,?,?,?,?,?)";

            // Now 'url', 'user', and 'pass' are recognized here
            try (Connection con = DriverManager.getConnection(url, user, pass);
                 PreparedStatement stmt = con.prepareStatement(query)) {

                stmt.setString(1, dto.getName());
                // ... rest of your code
                return stmt.executeUpdate() > 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
    }



    public String getPasswordByUsername(String username) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage_db", "root", "root");
             PreparedStatement stmt = con.prepareStatement("SELECT password FROM signup_tb WHERE username = ?")) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) return rs.getString("password");
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }
}