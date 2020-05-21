package com.lsg.web.serviceImpls;

import com.lsg.web.domains.PlayerDTO;
import com.lsg.web.mappers.PlayerMapper;
import com.lsg.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerSeviceImpl implements PlayerService{
    @Autowired PlayerMapper playerMapper;

    @Override
    public List<PlayerDTO> retrieve() {
        return playerMapper.selectAll();
    }

    @Override
    public PlayerDTO findOne(String searchWord) {
        return playerMapper.selectOne(searchWord);
    }




    @Override
    public PlayerDTO login(PlayerDTO params) {
        return playerMapper.login(params);
    }


}
