package softuni.mix_shop.web;

import java.security.Principal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(HttpSession httpSession) {
        return httpSession.getAttribute("user")==null?"index" : "home";

    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/admin")
    public ModelAndView admin(@AuthenticationPrincipal Principal principal) {
        ModelAndView mav= new ModelAndView("admin");
        mav.addObject("user", principal);
        return mav;
    }

    @GetMapping("/user")
    public ModelAndView user(@AuthenticationPrincipal Principal principal) {
        ModelAndView mav= new ModelAndView("user");
        mav.addObject("user", principal);
        return mav;
    }
}
