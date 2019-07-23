package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    CategoriesRepository categoriesRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    CategoriesCarRepository categoriesCarRepository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("category",categoriesRepository.findAll() );
        model.addAttribute("cars",carRepository.findAll());
        model.addAttribute("categoryCars",categoriesCarRepository);
        return "index";
    }

    @GetMapping("/addcar")
    public String carForm(Model model){
        model.addAttribute("car", new Car());
//        model.addAttribute("category",categoriesRepository.findAll());
        return  "carForm";


    }

    @PostMapping("/process")
    public String processForm(@Valid Car car,
                              BindingResult result){
        if(result.hasErrors()){
            return "carForm";
        }
        carRepository.save(car);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showCar(@PathVariable("id") long id, Model model){
        model.addAttribute("car", carRepository.findById(id).get());
        return  "showcar";
    }

    @RequestMapping("/update/{id}")
    public String updateCar(@PathVariable("id") long id, Model model){
        model.addAttribute("car", carRepository.findById(id).get());
        return "carForm";
    }

    @RequestMapping("/delete/{id}")
    public String delCar(@PathVariable("id")long id){
        carRepository.deleteById(id);
        return "redirect:/";
    }
}