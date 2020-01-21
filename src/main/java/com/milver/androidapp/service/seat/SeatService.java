package com.milver.androidapp.service.seat;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SeatService {

    List<SeatDto> findAll(Pageable pageable);
    SeatDto save(SeatDto dto);
}
