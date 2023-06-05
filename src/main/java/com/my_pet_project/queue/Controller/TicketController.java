package com.my_pet_project.queue.Controller;

import model.Ticket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {


    @GetMapping("/get")
    public Ticket getTicket (){
        return new Ticket(12);
    }
}
