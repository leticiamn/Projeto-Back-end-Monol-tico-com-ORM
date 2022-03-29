package iftm.demorestful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/alo")
        public Dominio greeting() {
                return new Dominio("alô mundo");
        }
}
