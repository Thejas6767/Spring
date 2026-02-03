package com.xworkz.bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank")
public class BankController {

    public BankController() {
        System.out.println("BankController object created");
    }

    @PostMapping("/open")
    public String openAccount() {
        return "bankOpen";
    }

    @PostMapping("/deposit")
    public String depositMoney() {
        return "bankDeposit";
    }

    @PostMapping("/withdraw")
    public String withdrawMoney() {
        return "bankWithdraw";
    }

    @PostMapping("/details")
    public String viewDetails() {
        return "bankDetails";
    }
}
