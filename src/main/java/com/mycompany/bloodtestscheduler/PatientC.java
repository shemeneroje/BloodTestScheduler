/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

import java.util.Comparator;

/**
 *
 * @author shemeneroje
 */
public class PatientC implements Comparator<Patient>{
     @Override
    public int compare(Patient p1, Patient p2) {
        // Sort by Priority > Age > Hospital Status
        int priorityComparison = Integer.compare(p2.getPriorityLevel(), p1.getPriorityLevel());
        if (priorityComparison != 0) return priorityComparison;

        int ageComparison = Integer.compare(p2.getAge(), p1.getAge());
        if (ageComparison != 0) return ageComparison;

        return Boolean.compare(p2.isFromHospital(), p1.isFromHospital());
    }
    
}
