package takecare.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import takecare.demo.model.Pharmacies;
import takecare.demo.business.PharmacieBusiness;

@Controller
public class HomeController {
    @Autowired
    private PharmacieBusiness pharmacieBusiness;

    // Page d'accueil
    @GetMapping("/register")
    public String showIndex(Model model) {
        Iterable<Pharmacies> pharmacies = pharmacieBusiness.allPharmacies();
        model.addAttribute("pharmacies", pharmacies);

        return "register";
    }
}
