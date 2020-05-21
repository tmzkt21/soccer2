package com.lsg.web.mappers;

import com.lsg.web.domains.TeamDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMapper {
    public List<TeamDTO> selectALL();
}
