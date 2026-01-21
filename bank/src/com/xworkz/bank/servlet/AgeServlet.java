package com.xworkz.bank.servlet;





import com.xworkz.bank.dto.AgeDto;
import com.xworkz.bank.service.AgeValidation;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/age", loadOnStartup = 2)
public class AgeServlet extends HttpServlet {

    public AgeServlet(){
        System.out.println("AgeServlet Object Creation....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String age = req.getParameter("age");
        int ageValue = Integer.parseInt(age);

        System.out.println("Age : "+age);

        AgeDto dto = new AgeDto(ageValue);
        AgeValidation validation = new AgeValidation();
        boolean value = validation.ageValidation(dto);

        resp.setContentType("text");
        PrintWriter writer = resp.getWriter();

        if (value){
            writer.println("Age is Saved");
        }else {
            writer.println("Age should between 18 to 60.");
        }
    }
}
