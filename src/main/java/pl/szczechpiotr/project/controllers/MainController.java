package pl.szczechpiotr.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.szczechpiotr.project.Formularz;
import pl.szczechpiotr.project.Kalkulator;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){return "index";}

    @GetMapping("/Gratulacje")
    public String gratulacje(){return "Gratulacje";}

    @PostMapping("/{index}")
    public String index2 (@RequestParam("income") double income,
                          @RequestParam("loan") double loan,
                          @RequestParam("loanTime") int loanTime){

    String result = Kalkulator.kalkuluj(income,loan,loanTime);

    return result;
    }
}
