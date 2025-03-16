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

public class MissingP implements PTracker {
    private LinkedList<Patient> noShowList;

    public MissingP() {
        noShowList = new LinkedList<>();
    }

    @Override
    public void addNoShow(Patient p) {
        if (noShowList.size() == 5) {
            noShowList.removeFirst();
        }
        noShowList.addLast(p);
    }

    @Override
    public void showNoShows() {
        System.out.println("Last 5 No-Shows:");
        for (Patient p : noShowList) {
            System.out.println(p);
        }
    }
}
