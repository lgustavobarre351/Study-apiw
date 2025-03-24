//Commit

package com.github.lgustavobarre351.study_api;

import org.springframework.web.bind.annotation.GetMapping; // Serve para mapear o método GET
import org.springframework.web.bind.annotation.RequestMapping; // Serve para mapear a URL
import org.springframework.web.bind.annotation.RestController; // Serve para indicar que a classe é um controlador REST

@RestController // Indica que a classe é um controlador REST
@RequestMapping("ping") // Mapeia a URL

public class ControllerPing { 
    
    @GetMapping 
    public String ping() {
        return "Pong!";
    }
}
