/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */

import com.mycompany.bloodtestscheduler.Patient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PatientQueue {
    private ArrayList<Patient> queue;

    public PatientQueue() {
        queue = new ArrayList<>();
    }

    public int size() {
        return queue.size();  // Return the size of the queue
    }

    // Enqueue method to add a patient to the queue
    public void enqueue(Patient newPatient) {
        queue.add(newPatient);
        sortQueue();  // Sort after adding a new patient
    }

    // Sort the queue by priority, age, and hospital status
    private void sortQueue() {
        // Sorting the queue using Collections.sort and a custom comparator
        Collections.sort(queue, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Compare by priority
                int priorityCompare = Integer.compare(p2.getPriorityValue(), p1.getPriorityValue());
                if (priorityCompare != 0) {
                    return priorityCompare;
                }
                // If priorities are the same, compare by age
                int ageCompare = Integer.compare(p1.getAge(), p2.getAge());
                if (ageCompare != 0) {
                    return ageCompare;
                }
                // If age is also the same, compare by hospital status
                return Boolean.compare(p2.isFromHospital(), p1.isFromHospital());
            }
        });
    }

    // Get patient details in a string format
    public String getPatientDetails() {
        StringBuilder details = new StringBuilder("*****\n");

        // Add patient details to the string
        for (Patient patient : queue) {
            details.append(patient.toString()).append("\n");
        }

        return details.toString();
    }
}
