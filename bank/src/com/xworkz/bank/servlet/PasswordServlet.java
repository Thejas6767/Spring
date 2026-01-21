package com.xworkz.bank.servlet;

import com.xworkz.bank.dto.PasswordDto;
import com.xworkz.bank.service.PasswordValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/password" , loadOnStartup = 3)
public class PasswordServlet extends HttpServlet {

    public PasswordServlet(){
        System.out.println("PasswordServlet Object Creation....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        System.out.println("Password : "+password);
        System.out.println("Confirm Password : "+confirmPassword);

        PasswordDto dto = new PasswordDto(password,confirmPassword);
        PasswordValidation validation = new PasswordValidation();
        boolean value = validation.passwordValidation(dto);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();

        if (value){
            writer.println("Password and ConfirmPassword are same and are Saved");
        }else {
            writer.println("Invalid password. Password must start with an uppercase letter, " +
                    "contain at least 8 characters, and include at least 2 special characters.");
        }

    }
}
