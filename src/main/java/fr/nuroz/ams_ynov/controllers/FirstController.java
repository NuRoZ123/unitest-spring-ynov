package fr.nuroz.ams_ynov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/info")
//    @ResponseBody
    public String information() {
        return "info";
    }

    @GetMapping("/details")
//    @ResponseBody
    public String detailInformation() {
        return "detail";
    }
}
