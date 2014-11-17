package dk.vandborgandersen.api.test.web;

import dk.vandborgandersen.api.test.domain.HelloWorld;
import dk.vandborgandersen.api.test.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
@RestController
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public HelloWorld getHello() {
        HelloWorld helloWorld = helloWorldService.save(new HelloWorld());
        return helloWorld;
    }

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
