package com.xworkz.signinandsignup.repository;

import com.xworkz.signinandsignup.dto.SignUpDto;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class Database {

    private String url = "jdbc:mysql://localhost:3306/loginpage_db";
    private String user = "root";
    private String pass = "root";

    public boolean save(SignUpDto dto) {

        String query = "insert into signup_tb(name,surname,phone,email,username,password) values (?,?,?,?,?,?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setString(1, dto.getName());
            stmt.setString(2, dto.getSurname());
            stmt.setLong(3, dto.getPhoneNumber());
            stmt.setString(4, dto.getEmail());
            stmt.setString(5, dto.getUsername());
            stmt.setString(6, dto.getPassword());

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getPasswordByUsername(String username) {

        String query = "select password from signup_tb where username=?";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("password");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
