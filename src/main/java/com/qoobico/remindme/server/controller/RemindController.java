package com.qoobico.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/remind")
public class RemindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getReminder() {
        return "My reminder";
    }
}
