package com.xworkz.election.controller;

import com.xworkz.election.dto.ElectionDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ElectionController {
    @PostMapping ("/elctionDetails")
    public String elctionDetails(){

         return "election";

    }

}
