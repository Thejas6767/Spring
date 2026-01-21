package com.xworkz.bank.servlet;



import com.xworkz.bank.dto.EmailDto;
import com.xworkz.bank.service.EmailValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/email" , loadOnStartup = 4)
public class EmailServlet extends HttpServlet {

    public EmailServlet(){
        System.out.println("EmailServlet Object Creation....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");

        System.out.println("Email : "+email);

        EmailDto dto = new EmailDto(email);
        EmailValidation validation = new EmailValidation();
        boolean value = validation.emailValidation(dto);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();

        if (value){
            writer.println("Email is Saved");
        }else {
            writer.println("Email should contain 8 to 15 char and must have @gmail.com.");
        }

    }
}
