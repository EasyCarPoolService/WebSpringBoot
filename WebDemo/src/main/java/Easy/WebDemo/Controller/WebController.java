package Easy.WebDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {


    @GetMapping("/")
    public String main(){

        return "index";
    }

    @GetMapping("/manager")
    public String manager(){

        return"manager";
    }
}
