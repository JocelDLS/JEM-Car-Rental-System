/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.rental.management.system.users.component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author joker
 */
public class invoice {

    private int vehicle_id;
    private String brand;
    private String model;
    private String registration_number;
    private double price; // Change to double to accommodate price per day
    private LocalDate start_date;
    private LocalDate end_date;
    private double total_price;

    // Constructor
    public invoice(int bookingId, String brand, String model, String registrationNumber, 
                   double pricePerDay, LocalDate startDate, LocalDate endDate, double totalPrice) {
        this.vehicle_id = bookingId;
        this.brand = brand;
        this.model = model;
        this.registration_number = registrationNumber;
        this.price = pricePerDay;
        this.start_date = startDate;
        this.end_date = endDate;
        this.total_price = totalPrice;
    }
    

    // Getter and Setter Methods
    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    // Method to calculate the total price based on the number of rental days
    private double calculateTotalPrice() {
        if (start_date != null && end_date != null && !start_date.isAfter(end_date)) {
            long daysBetween = ChronoUnit.DAYS.between(start_date, end_date);
            if (daysBetween < 0) {
                throw new IllegalArgumentException("End date must be after start date");
            }
            return daysBetween * price;
        } else {
            throw new IllegalArgumentException("Invalid date range");
        }
    }

    // Method to get the full name (brand and model)
    public String getFullName() {
        return getBrand() + " " + getModel();
    }

    
}
