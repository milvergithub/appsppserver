package com.milver.androidapp.web;

import com.milver.androidapp.service.pickup.PickupDto;
import com.milver.androidapp.service.pickup.PickupService;
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
@RequestMapping("v1/pickups")
public class PickupResource {

    @Autowired
    private PickupService pickupService;

    @GetMapping
    public ResponseEntity<List<PickupDto>> pickups(Pageable pageable) {
        return new ResponseEntity<>(pickupService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PickupDto> save(@RequestBody PickupDto pickupDto) {
        return new ResponseEntity<>(pickupService.save(pickupDto), HttpStatus.OK);
    }
}
