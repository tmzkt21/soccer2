package com.lsg.web.services;

import com.lsg.web.domains.TeamDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeamService {
   public List<TeamDTO> retrieveALL();
}
