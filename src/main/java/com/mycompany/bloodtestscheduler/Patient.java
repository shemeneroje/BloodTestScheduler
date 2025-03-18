/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */
public class Patient implements Comparable<Patient>{
    private String name;
    private int age;
    private String priority; 
    private String gpDetails;
    private boolean fromHospital;
    private boolean missedAppointment; 

    // Constructor
    public Patient(String name, int age, String priority, String gpDetails, boolean fromHospital, boolean missedAppointment) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
        this.missedAppointment = missedAppointment; 
    }
    
    

    // Convert priority to a numerical value
    public int getPriorityLevel() {
        switch (priority) {
            case "Urgent": return 3;
            case "Medium": return 2;
            case "Low": return 1;
            default: return 0;  
        }
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.getPriorityLevel(), other.getPriorityLevel());
    }
    
    // Getter and Setter 
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

    public boolean isMissedAppointment() {
        return missedAppointment;
    }

    public void setMissedAppointment(boolean missedAppointment) {
        this.missedAppointment = missedAppointment;
    }

    // toString method for displaying patient information
    //Stack Overflow (2024), Java - How to Implement toString() Method for a Class. Available at: https://stackoverflow.com/questions/3221639/java-how-to-implement-tostring-method-for-a-class (Accessed: 16 March 2025).
    @Override
    public String toString() {
        return "Name: " + name + " | GP Details: " + priority + " | Age: " + age
                + " | From Hospital: " + fromHospital + " | Missed Appointment: " + missedAppointment
                + " | Priority: " + gpDetails;
    }
}
