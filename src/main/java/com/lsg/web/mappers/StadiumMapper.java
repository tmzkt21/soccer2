package com.lsg.web.mappers;

import com.lsg.web.domains.StadiumDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadiumMapper {

    public List<StadiumDTO> selectALL();
}
