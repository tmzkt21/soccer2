package com.lsg.web.controllers;


import com.lsg.web.domains.StadiumDTO;
import com.lsg.web.services.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {
    @Autowired
    StadiumService stadiumService;

    @GetMapping("")
    public List<StadiumDTO> getList() {

        return stadiumService.retrieveALL();

    }

}
