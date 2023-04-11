package com.example.Seat.Reservation;

public class Seat {

    int seatNo;
    int employeeId;
    int date;

    public Seat() {
    }

    public Seat(int seatNo, int employeeId, int date) {
        this.seatNo = seatNo;
        this.employeeId = employeeId;
        this.date = date;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
