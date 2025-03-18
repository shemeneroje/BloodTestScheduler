/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */
import java.util.LinkedList;

public class MissingP implements PTrackerInterface {
    private LinkedList<Patient> missingPatients;

    public MissingP() {
        missingPatients = new LinkedList<>();
    }

    @Override
    public void addP(Patient patient) {
        missingPatients.add(patient);
    }

    @Override
    public void addNoShow(Patient patient) {
        missingPatients.add(patient);
    }

    @Override
    public Patient getHighPriority() {
        return missingPatients.peek(); 
    }

    @Override
    public void showNoShows() {
        for (Patient patient : missingPatients) {
            System.out.println(patient);
        }
    }
}