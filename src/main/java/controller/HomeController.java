package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
//@RestController
public class HomeController {
@PostMapping("/dictionary")
    public String translate(@RequestParam String english, ModelMap modelMap){
    System.out.println("english === "+english);
    modelMap.put("hello", "xin chao");
    modelMap.put("goodbye", "tam biet");
    modelMap.put("I love you", "toi yeu ban");
    english = english.toLowerCase();
    String vietnamese = (String) modelMap.get(english);
    if(vietnamese==null){
        vietnamese = "not found";
        modelMap.addAttribute("english", english);
        modelMap.addAttribute("vietnamese",vietnamese);
    } else {
        modelMap.addAttribute("english", english);
        modelMap.addAttribute("vietnamese",vietnamese);

    }
    return "/dictionary";
}

}
