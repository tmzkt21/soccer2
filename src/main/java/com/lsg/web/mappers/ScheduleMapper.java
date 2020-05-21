package com.lsg.web.mappers;

import com.lsg.web.domains.PlayerDTO;
import com.lsg.web.domains.ScheduleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleMapper {
   public List<ScheduleDTO> selectALl();

}
