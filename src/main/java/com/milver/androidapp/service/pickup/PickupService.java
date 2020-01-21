package com.milver.androidapp.service.pickup;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface PickupService {

    List<PickupDto> findAll(Pageable pageable);

    PickupDto save(PickupDto pickupDto);
}
