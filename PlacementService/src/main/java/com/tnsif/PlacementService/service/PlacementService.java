package com.tnsif.PlacementService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementService.entities.Placement;
import com.tnsif.PlacementService.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    // Insert or update a placement
    public Placement addPlacement(Placement placement) {
        return repo.save(placement);
    }

    // Get all placements
    public List<Placement> listAll() {
        return repo.findAll();
    }

    // Get placement by ID
    public Placement getPlacement(int id) {
        Optional<Placement> p = repo.findById(id);
        return p.orElse(null);
    }

    // Delete placement
    public void deletePlacement(int id) {
        repo.deleteById(id);
    }

    // Update placement
    public Placement updatePlacement(int id, Placement placement) {
        Placement existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setCompanyName(placement.getCompanyName());
            existing.setJobRole(placement.getJobRole());
            existing.setPackageOffered(placement.getPackageOffered());
            existing.setDriveDate(placement.getDriveDate());
            existing.setLocation(placement.getLocation());
            existing.setEligibilityCriteria(placement.getEligibilityCriteria());
            return repo.save(existing);
        }
        return null;
    }
}


