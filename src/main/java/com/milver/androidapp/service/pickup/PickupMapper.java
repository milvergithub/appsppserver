package com.milver.androidapp.service.pickup;

import com.milver.androidapp.domain.Pickup;
import org.modelmapper.ModelMapper;

public class PickupMapper {

    /**
     * ModelMapper instance to convert a source object to destination object.
     */
    private static final ModelMapper modelMapper = new ModelMapper();

    private PickupMapper() {}

    public static PickupDto toDto(Pickup pickup) {
        return modelMapper.map(pickup, PickupDto.class);
    }

    public static Pickup toEntity(PickupDto pickupDto) {
        return modelMapper.map(pickupDto, Pickup.class);
    }
}
