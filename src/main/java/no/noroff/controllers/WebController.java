package no.noroff.controllers;

import no.noroff.models.*;
import no.noroff.repositories.DataCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WebController {

    private DataCollector dataCollector;

    @Autowired
    public void setDataCollector(final DataCollector dataCollector) {
        this.dataCollector = dataCollector;
    }

    @GetMapping("/")
    String getIndex () {
        return "index";
    }

    @GetMapping("/randomjoke")
    @ResponseBody
    RandomJoke getJoke(){
        return dataCollector.findRandomJoke();
    }

    @GetMapping("/dadjoke")
    @ResponseBody
    DadJoke getDadJoke() {
        return dataCollector.findDadJoke();
    }


    @GetMapping("/advice")
    @ResponseBody
    Advice getAdvice() {
        return dataCollector.findAdvice();
    }


    @GetMapping("/quote")
    @ResponseBody
    Quote[] getQuote() {
        return dataCollector.findQuote();
    }


}
