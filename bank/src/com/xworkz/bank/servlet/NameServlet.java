package com.xworkz.bank.servlet;



import com.xworkz.bank.dto.NameDto;
import com.xworkz.bank.service.NameValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/name", loadOnStartup = 1)
public class NameServlet extends HttpServlet {

    public NameServlet() {
        System.out.println("NameServlet Object Creation....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        System.out.println("Name : " + name);

        NameDto dto = new NameDto(name);
        NameValidation validation = new NameValidation();
        boolean value = validation.nameValidation(dto);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();

        if (value) {
            writer.println("Name submitted successfully.");
        } else {
            writer.println("Characters should be between 3 to 10 & should not contain any number or special symbols.");

        }

    }
}