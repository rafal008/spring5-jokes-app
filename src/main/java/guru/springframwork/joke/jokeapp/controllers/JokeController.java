package guru.springframwork.joke.jokeapp.controllers;


import guru.springframwork.joke.jokeapp.services.JokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokerService jokeService;


    @Autowired
    public JokeController(JokerService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/",""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";

    }
}
