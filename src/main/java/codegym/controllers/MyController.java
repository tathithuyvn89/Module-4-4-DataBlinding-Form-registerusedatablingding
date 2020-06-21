package codegym.controllers;

import codegym.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @GetMapping("/")
    public String registerPage(Model model){
        model.addAttribute("student", new Student());
        return "register";
    }
    @PostMapping("registerSuccess")
    private ModelAndView loginSuccess(@ModelAttribute("student") Student student, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("register");
        } else {
            ModelAndView modelAndView = new ModelAndView("registerSuccess");
            modelAndView.addObject("student",student);
            return modelAndView;
        }

    }
    @ModelAttribute
    private void commonData(Model model){
        model.addAttribute("headerMessage","Wellcome to CodeGym");
        List<String> hobyList= new ArrayList<>();
        hobyList.add("Boi loi");
        hobyList.add("Cau long");
        hobyList.add("quan vot");
        hobyList.add("da bong");
        List<String> cityList= new ArrayList<>();
        cityList.add("ha noi");
        cityList.add("Sai gon");
        cityList.add("Da Nang");
        cityList.add("Thai Binh");
        List<String> genderList = new ArrayList<>();
        genderList.add("Nam");
        genderList.add("nu");
        model.addAttribute("hobyList", hobyList);
        model.addAttribute("genderList", genderList);
        model.addAttribute("cityList", cityList);
    }




}
