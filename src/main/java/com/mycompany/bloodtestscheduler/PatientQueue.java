/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */

import com.mycompany.bloodtestscheduler.PTrackerInterface;
import com.mycompany.bloodtestscheduler.Patient;
import com.mycompany.bloodtestscheduler.PatientC;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PatientQueue implements PTrackerInterface {
    private PriorityQueue<Patient> queue;
    private ArrayList<Patient> noShowList;

    // Constructor
    public PatientQueue() {
        queue = new PriorityQueue<>(new PatientC());  // Use custom comparator
        noShowList = new ArrayList<>();
    }

    // Enqueue method to add patients
    public void enqueue(Patient patient) {
        queue.offer(patient);  // Adds the patient based on priority
    }

    // Dequeue method to retrieve and remove the highest priority patient
    public Patient dequeue() {
        return queue.poll();  // Retrieves and removes the highest priority patient
    }

    // Get sorted patients
    public ArrayList<Patient> getSortedPatients() {
        PriorityQueue<Patient> tempQueue = new PriorityQueue<>(queue); 
        ArrayList<Patient> sortedList = new ArrayList<>();
        
        while (!tempQueue.isEmpty()) {
            sortedList.add(tempQueue.poll()); // Extract in sorted order
        }
        
        return sortedList;
    }

    // Display patients
    public String getPatientDetails() {
        StringBuilder details = new StringBuilder("*****\n");
        for (Patient patient : getSortedPatients()) {
            details.append(patient.toString()).append("\n");
        }
        return details.toString();
    }

    // Add missed patient to the no-show list
    @Override
    public void addNoShow(Patient patient) {
        noShowList.add(patient);  // Add patient to no-show list
    }

    // Show all no-show patients
    public String getNoShowDetails() {
        StringBuilder details = new StringBuilder("No-show patients:\n");
        for (Patient patient : noShowList) {
            details.append(patient.toString()).append("\n");
        }
        return details.toString();
    }

    // Implementing from PTrackerInterface
    @Override
    public Patient getHighPriority() {
        return queue.peek();  // Return the highest priority patient
    }

    // Show all no-show patients
    @Override
    public void showNoShows() {
        System.out.println(getNoShowDetails());  // Show missed patients
    }
    
    // Implementing addPatientToQueue from PTrackerInterface
    @Override
    public void addP(Patient patient) {
        enqueue(patient);  // Enqueue the patient
    }
} 
