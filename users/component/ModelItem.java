/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.rental.management.system.users.component;

import java.sql.ResultSet;
import javax.swing.Icon;

/**
 *
 * @author joker
 */
public class ModelItem {

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    

    /**
     * @return the registration_number
     */
    public String getRegistration_number() {
        return registration_number;
    }

    /**
     * @param registration_number the registration_number to set
     */
    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    /**
     * @return the vehicle_id
     */
    public int getVehicle_id() {
        return vehicle_id;
    }

    /**
     * @param vehicle_id the vehicle_id to set
     */
    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the transmission
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * @param transmission the transmission to set
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     * @return the price_per_day
     */
    public int getPrice_per_day() {
        return price_per_day;
    }

    /**
     * @param price_per_day the price_per_day to set
     */
    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the vehicle_type
     */
    public String getVehicle_type() {
        return vehicle_type;
    }

    /**
     * @param vehicle_type the vehicle_type to set
     */
    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    /**
     * @return the seating_capacity
     */
    public int getSeating_capacity() {
        return seating_capacity;
    }

    /**
     * @param seating_capacity the seating_capacity to set
     */
    public void setSeating_capacity(int seating_capacity) {
        this.seating_capacity = seating_capacity;
    }
    

    
   
    

    public ModelItem(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    
    
    public ModelItem(){
        
    }
    
    private int vehicle_id;
    private String brand;
    private String model;
    private String transmission;
    private int price_per_day;
    private Icon image;
    private int year;
    private String vehicle_type;
    private int seating_capacity;
    private String registration_number;
    private int customer_id;
    private String username;
    private String password;

    public String getFullName() {
        return getBrand() + " " + getModel() + " (" + getYear() + ")";
    }

   
}
