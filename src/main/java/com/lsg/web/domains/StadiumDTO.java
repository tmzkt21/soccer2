package com.lsg.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StadiumDTO {
    private String stadiumId , stadiumName , homeTeamId , seatCount ,
            address, ddd, tel;
}
