package com.milver.androidapp.repository;

import com.milver.androidapp.domain.Pickup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PickupRepository extends JpaRepository<Pickup, Long> {
}
