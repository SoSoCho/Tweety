package com.example.demo.controller;

import com.example.demo.model.TweetFact;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TweetFactController {

    TweetFact tweetFactItem = new TweetFact("Text");


@GetMapping("/")
    public String index(Model tweetFactModel){
        tweetFactModel.addAttribute("firstTweetFact",tweetFactItem);
        return "index";

    }

@PostMapping("/postTweetFact")
public String postTweetFact(WebRequest dataFromForm){
    TweetFact tweetFact = new TweetFact(dataFromForm.getParameter("tweetFact"));
    tweetFactItem = tweetFact;
    return"redirect:/";
}

}
