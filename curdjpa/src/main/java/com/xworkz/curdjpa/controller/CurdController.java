package com.xworkz.curdjpa.controller;

import com.xworkz.curdjpa.dto.CurdDto;
import com.xworkz.curdjpa.service.CurdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class CurdController {
    @Autowired
    private CurdService curdService;

    @PostMapping("/save")
    public ModelAndView save(CurdDto curdDto) {
        curdService.saveData(curdDto);
        ModelAndView mv = new ModelAndView();
        mv.addObject("dto", curdDto);

        mv.setViewName("registeredSuccesfully");
        return mv;
    }

    @GetMapping("/viewAll")
    public String viewAll(Model model) {
        List<CurdDto> dtos = curdService.getDtos();
        model.addAttribute("dtos", dtos);
        return "viewAll";
    }
}