package com.lsg.web.mappers;


import com.lsg.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlayerMapper {


   public PlayerDTO selectOne(String searchOrder);

   public PlayerDTO login(PlayerDTO params);

   public List<PlayerDTO> selectAll();
}
