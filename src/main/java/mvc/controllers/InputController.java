package mvc.controllers;

import mvc.models.InputModel;
import mvc.repositories.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InputController {
    //Connects to crudrepository to all to send info to the database
    @Autowired
    private InputRepository inputRepository;

    //Initial Get Method to load the java server page or jsp
    @RequestMapping(value = "/input", method = RequestMethod.GET) //state url extension localhost:8080/input
    public String inputGet(Model model) {
        model.addAttribute("input", new InputModel());
        return "input";
    }

    //Binds a model to a platform
    @RequestMapping(value = "/input", method = RequestMethod.POST)
    public String contactPost(Model model, @ModelAttribute("input") InputModel inputModel) {
        inputRepository.save(inputModel);
        System.out.println(inputModel.toString());
        return "redirect:/input";
    }
}
