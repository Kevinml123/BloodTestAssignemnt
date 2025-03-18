/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Kevin
 */
public interface SchedulerI {
    void addTest(BloodTest test);
    BloodTest getNextTest();
    BloodTest markNoShow();
}
