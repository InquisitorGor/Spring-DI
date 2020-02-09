package springframework.SpringDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springframework.SpringDI.services.GreetingService;
@Controller
public class PropertyInjectedController {

    @Autowired
    public @Qualifier("propertyInjectedGreetingService") GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
