/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bloodtestscheduler;

/**
 *
 * @author shemeneroje
 */
public interface PTrackerInterface {
    void addP(Patient p);
    Patient getHighPriority();
    void addNoShow(Patient p);
    void showNoShows();
}
