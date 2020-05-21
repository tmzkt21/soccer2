package com.lsg.web.services;


import com.lsg.web.domains.ScheduleDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ScheduleService {


    public List<ScheduleDTO> retrieveAll();

}
