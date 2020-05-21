package com.lsg.web.serviceImpls;

import com.lsg.web.domains.ScheduleDTO;
import com.lsg.web.mappers.ScheduleMapper;
import com.lsg.web.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleMapper scheduleMapper;


    @Override
    public List<ScheduleDTO> retrieveAll() {
        return scheduleMapper.selectALl();
    }
}
