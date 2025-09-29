package JulioL3mos.controllers;

import JulioL3mos.model.Greeting;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    //http://localhost:8080/greeting?name-Leandro
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "world")
            Object name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
