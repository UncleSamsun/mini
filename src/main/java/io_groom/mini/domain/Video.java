package io_groom.mini.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Video {

    private long videoSeq;
    private String video;
    private String videoThumbnail;
    private String memberSeq;
    private LocalDateTime regDate;
    private int publishYn;
    private char deleteYn;
}
