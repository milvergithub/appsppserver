package com.milver.androidapp.service.seat;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class SeatDto implements Serializable {
    private Integer id;
    private String number;
    private String tag;
    private String status;
}
