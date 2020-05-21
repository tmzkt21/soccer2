package com.lsg.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ScheduleDTO {
    private String scheDate, stadiumId , guBun , homeTeamId, awayTeamId ,
            homeScore,awayScore;
}
