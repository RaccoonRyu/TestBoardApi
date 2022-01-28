package com.iabacus.zerolist.boarddto;

import java.time.LocalDateTime; // LocalDatetime :

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("board")
@Getter
@Setter
public class boardDto {
    private int id;
    private String title;
    private String contents;
    private LocalDateTime insertDay;
    private LocalDateTime updateDay;
}
