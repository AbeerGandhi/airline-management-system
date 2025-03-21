package com.example.airline.controller;

import com.example.airline.model.Flight;
import com.example.airline.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")

public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    // testing
    @GetMapping("/test")
    public String testEndpoint() {
        return "flight API working";
    }
    //to get all floights
    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
 //to get flight by id
    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }
}
