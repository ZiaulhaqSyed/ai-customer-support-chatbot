package controller;


import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/home")
    public String home() {
        System.out.println(" This is feature branch ");
        return "home"; // This will render the home.html template
    }


}
