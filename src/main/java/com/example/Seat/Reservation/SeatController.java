package com.example.Seat.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeatController {

    @Autowired
    SeatRepository seatRepository ;

    @PostMapping("/add-Seat")
    public String addSeat(@RequestBody Seat seat) {
        return seatRepository.addSeat(seat);
    }

    @PostMapping("/add-Employee")
    public String addEmployee(@RequestBody Employee employee) {

        return seatRepository.addEmployee(employee);
    }

}
