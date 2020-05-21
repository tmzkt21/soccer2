package com.lsg.web.serviceImpls;

import com.lsg.web.domains.StadiumDTO;
import com.lsg.web.mappers.ScheduleMapper;
import com.lsg.web.mappers.StadiumMapper;
import com.lsg.web.services.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumServiceImpl  implements StadiumService {
   @Autowired
   StadiumMapper stadiumMapper;

    @Override
    public List<StadiumDTO> retrieveALL() {
        return stadiumMapper.selectALL();
    }
}
