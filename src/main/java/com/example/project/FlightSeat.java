package com.example.project;

public class FlightSeat {
    private Status status;
    private int price;

    public FlightSeat(String numberNo, String className, Status status, int price) {
        super(numberNo, className);
        this.status = status;
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }
}
