package io_groom.mini.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Member {

    private long memberSeq;

    private String memberId;

    private String memberPw;

    private String memberNick;

    private String memberProfile;

    private String memberInfo;

    private char useYn;

    @JsonProperty("reg_date")
    private LocalDateTime regDate;
}
