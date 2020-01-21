package com.milver.androidapp.service.seat;

import com.milver.androidapp.domain.Seat;
import org.modelmapper.ModelMapper;

public class SeatMapper {

    /**
     * ModelMapper instance to convert a source object to destination object.
     */
    private static final ModelMapper modelMapper = new ModelMapper();

    private SeatMapper() {}

    public static SeatDto toDto(Seat seat) {
        return modelMapper.map(seat, SeatDto.class);
    }

    public static Seat toEntity(SeatDto seatDto) {
        return modelMapper.map(seatDto,Seat.class);
    }
}
