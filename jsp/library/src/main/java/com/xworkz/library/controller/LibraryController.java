package com.xworkz.library.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class LibraryController {

    public LibraryController() {
        System.out.println("LibraryController object created");
    }

    @PostMapping("/add")
    public String addBook() {
        return "libraryAdd";
    }

    @PostMapping("/update")
    public String updateBook() {
        return "libraryUpdate";
    }

    @PostMapping("/remove")
    public String removeBook() {
        return "libraryRemove";
    }

    @PostMapping("/list")
    public String listBooks() {
        return "libraryList";
    }
}

