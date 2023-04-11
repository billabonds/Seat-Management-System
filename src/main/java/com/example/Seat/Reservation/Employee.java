package com.example.Seat.Reservation;

public class Employee {

    int EmployeeId;
    Team team;

    public Employee() {
    }

    public Employee(int employeeId, Team team) {
        EmployeeId = employeeId;
        this.team = team;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
