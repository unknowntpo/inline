package org.example.domain;

public class Reservation {
    private int id;
    private int restaurantId;
    private String telephone;
    private String email;
    private int numOfCustomers;

    // Constructor
    public Reservation(int id, int restaurantId, String telephone, String email, int numOfCustomers) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.telephone = telephone;
        this.email = email;
        this.numOfCustomers = numOfCustomers;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumOfCustomers(int numOfCustomers) {
        this.numOfCustomers = numOfCustomers;
    }
}
