package com.example.Seat.Reservation;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.HashSet;

@Repository
public class SeatRepository {

      // Question :
            //    Create a seat reservation system.
                //    Seat:( seatNo, employeeId, date);
                //    Employee:( EmployeeId, Team)
                //    Team: ENUM(TECH, HR, SALES, ACCOUNTS)
                //    POST: addSeat, addEmployee

    HashMap<Integer,Seat> seatDb = new HashMap<>();
    HashMap<Integer,Employee> employeeDb = new HashMap<>();

    public String addSeat(Seat seat) {

        seatDb.put(seat.getSeatNo(), seat);
        return "Seat added Successfully";
    }

    public String addEmployee(Employee employee) {

        employeeDb.put(employee.getEmployeeId(),employee);
        return "Employee added Successfully";
    }

}
