package io_groom.mini.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Admin {

    private String AdminSeq;

    private String AdminId;

    private String AdminPw;

    private String adminName;

    private char useYn;

    private int regSeq;

    private LocalDateTime regDate;
}
