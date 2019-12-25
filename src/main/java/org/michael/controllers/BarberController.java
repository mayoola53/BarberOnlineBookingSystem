package org.michael.controllers;

import org.michael.entities.BarberEntity;


import org.michael.services.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BarberController {

    @Autowired
    private BarberService barberService;

    @GetMapping("/barbers/getBarbers")
    public String getBarber(Model model){
        model.addAttribute("barbers",barberService.getAll());
        return "";
    }

    @GetMapping("/barber/getBarber/{id}")
    public String getUser(@PathVariable int id, Model model){
        model.addAttribute("barber",barberService.getById(id));
        return "";

    }
    @PostMapping("/barber/addBarber")
    public String addUser(@Valid BarberEntity newBarber){
        barberService.addBarber(newBarber);
        return "registerBarber";
    }

    @GetMapping("/barber/editBarber/{id}")
    public String editClassroom(@Valid BarberEntity editedBarber, @PathVariable int id, Model model) {
        barberService.editBarber(editedBarber, id);
        model.addAttribute("barber", barberService.getAll());
        return "";
    }

    @GetMapping("/barber/removeBarber/{id}")
    public String removeClassroom(@PathVariable int id, Model model) {
        barberService.removeBarber(id);
        model.addAttribute("barber", barberService.getAll());
        return "";
    }



}
