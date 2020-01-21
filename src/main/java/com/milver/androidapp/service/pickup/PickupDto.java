package com.milver.androidapp.service.pickup;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PickupDto implements Serializable {

    private Long id;

    private String name;

    private String address;

    private String latitude;

    private String longitude;

    private Double amount;

    private String ci;

    private String phone;
}
