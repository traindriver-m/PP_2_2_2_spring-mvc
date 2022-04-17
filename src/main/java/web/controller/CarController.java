package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.GetCarService;

@Controller
public class CarController {
    private GetCarService service;

    @Autowired
    public void setService(GetCarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("carlist", service.getCars(count));
        return "cars";
    }
}
