/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */
public class Patient {
    private String name;
    private int age;
    private String priority; // high, medium, low
    private String gpDetails;
    private boolean fromHospital;

    public Patient(String name, int age, String priority, String gpDetails, boolean fromHospital) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }

    public int getPriorityValue() {
        switch (priority.toLowerCase()) {
            case "high": return 3;
            case "medium": return 2;
            case "low": return 1;
            default: return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }
    

    public int getAge() {
        return age;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

    @Override
    public String toString() {
        return name + " | " + priority + "| Age: " + age + "| From Hospital: " + fromHospital + ")";
    }

   
}
