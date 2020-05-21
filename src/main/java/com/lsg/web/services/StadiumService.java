package com.lsg.web.services;

import com.lsg.web.domains.StadiumDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StadiumService {
    public List<StadiumDTO> retrieveALL();

}
