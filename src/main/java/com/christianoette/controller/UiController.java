package com.christianoette.controller;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping
public class UiController {

    @GetMapping( value = "/")
    public RedirectView redirectView() {
        return new RedirectView("/swagger-ui/index.html");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void afterStartup() {
        System.out.println("Open application at http://localhost:8080 and http://localhost:8080/h2-console");
    }
}
