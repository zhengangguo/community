package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){

        try {
            return "index";
        }
        catch (Exception e)
        {
            System.out.println("this is a exception");
            return "";
        }



    }
}
