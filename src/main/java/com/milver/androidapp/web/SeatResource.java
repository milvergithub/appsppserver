package com.milver.androidapp.web;

import com.milver.androidapp.service.seat.SeatDto;
import com.milver.androidapp.service.seat.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("v1/seats")
public class SeatResource {

    @Autowired
    private SeatService seatService;

    @GetMapping
    public ResponseEntity<List<SeatDto>> sets(Pageable pageable) {
        return new ResponseEntity<>(seatService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SeatDto> save(@RequestBody SeatDto seatDto) {
        return new ResponseEntity<>(seatService.save(seatDto), HttpStatus.OK);
    }
}
