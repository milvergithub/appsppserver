package com.milver.androidapp.service.pickup;

import com.milver.androidapp.domain.Pickup;
import com.milver.androidapp.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickupServiceImpl implements PickupService {

    private final PickupRepository pickupRepository;

    @Autowired
    public PickupServiceImpl(PickupRepository pickupRepository) {
        this.pickupRepository = pickupRepository;
    }
    @Override
    public List<PickupDto> findAll(Pageable pageable) {
        Page<Pickup> pickups = pickupRepository.findAll(pageable);
        return pickups.map(PickupMapper::toDto).toList();
    }

    @Override
    public PickupDto save(PickupDto pickupDto) {
        Pickup pickup = PickupMapper.toEntity(pickupDto);
        pickupRepository.save(pickup);
        return pickupDto;
    }
}
