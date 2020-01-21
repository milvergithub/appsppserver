package com.milver.androidapp.service.seat;

import com.milver.androidapp.domain.Seat;
import com.milver.androidapp.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<SeatDto> findAll(Pageable pageable) {
        Page<Seat> seats = seatRepository.findAll(pageable);
        return seats.map(SeatMapper::toDto).toList();
    }

    @Override
    public SeatDto save(SeatDto dto) {
        Seat seat = SeatMapper.toEntity(dto);
        seatRepository.save(seat);
        return dto;
    }
}
