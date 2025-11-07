package com.tnsif.PlacementService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.PlacementService.entities.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer> {

}
