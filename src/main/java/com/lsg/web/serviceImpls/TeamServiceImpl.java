package com.lsg.web.serviceImpls;

import com.lsg.web.domains.TeamDTO;
import com.lsg.web.mappers.TeamMapper;
import com.lsg.web.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamMapper teamMapper;
    @Override
    public List<TeamDTO> retrieveALL() {
        return teamMapper.selectALL();
    }
}
