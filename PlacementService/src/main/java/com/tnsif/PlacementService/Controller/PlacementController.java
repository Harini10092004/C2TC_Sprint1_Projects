package com.tnsif.PlacementService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.PlacementService.entities.Placement;
import com.tnsif.PlacementService.service.PlacementService;

@RestController
@RequestMapping("/placement")
public class PlacementController {

    @Autowired
    private PlacementService service;

    // Add a placement
    @PostMapping("/add")
    public Placement addPlacement(@RequestBody Placement placement) {
        return service.addPlacement(placement);
    }

    // Get all placements
    @GetMapping("/getAll")
    public List<Placement> listAll() {
        return service.listAll();
    }

    // Get placement by ID
    @GetMapping("/{id}")
    public Placement getPlacement(@PathVariable int id) {
        return service.getPlacement(id);
    }

    // Update placement
    @PutMapping("/update/{id}")
    public Placement updatePlacement(@PathVariable int id, @RequestBody Placement placement) {
        return service.updatePlacement(id, placement);
    }

    // Delete placement
    @DeleteMapping("/delete/{id}")
    public String deletePlacement(@PathVariable int id) {
        service.deletePlacement(id);
        return "Placement deleted successfully!";
    }
}
