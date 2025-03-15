/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */
import java.util.PriorityQueue;
import java.util.Comparator;

public class Scheduler implements TestScheduler {
    private PriorityQueue<Patient> queue;

    public Scheduler() {
        queue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.getPriorityValue() != p2.getPriorityValue()) {
                    return Integer.compare(p2.getPriorityValue(), p1.getPriorityValue());
                }
                if (p1.isFromHospital() && !p2.isFromHospital()) {
                    return -1;
                }
                if (!p1.isFromHospital() && p2.isFromHospital()) {
                    return 1;
                }
                return Integer.compare(p2.getAge(), p1.getAge());
            }
        });
    }

    @Override
    public void addPatient(Patient p) {
        queue.add(p);
    }

    @Override
    public Patient getNextPatient() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}