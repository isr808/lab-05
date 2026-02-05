package com.example.lab5_starter;

import java.io.Serializable;

// City object
public class City implements Serializable {

    // attributes
    private String id;           // ADD THIS LINE
    private String name;
    private String province;

    // constructor
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    // ADD: Empty constructor (required for Firestore)
    public City() {
    }

    // ADD THESE TWO METHODS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Existing getters and setters
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}