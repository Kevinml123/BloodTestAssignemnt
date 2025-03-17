/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kevin
 */
public class Scheduler {

    private PriorityQueue<BloodTest> testQueue;
    private Queue<BloodTest> cancelledQueue;

    public Scheduler() {
        testQueue = new PriorityQueue<>(this::comparePriority);
        cancelledQueue = new LinkedList<>();
    }

    private int comparePriority(BloodTest bt1, BloodTest bt2) {
        if (bt1.getPriority().equalsIgnoreCase("Critical")) {
            return -1;
        }
        if (bt2.getPriority().equalsIgnoreCase("Critical")) {
            return 1;
        }
        if (bt1.getPriority().equalsIgnoreCase("Medium")) {
            return -1;
        }
        return 1;
    }

    public void addTest(BloodTest test) {
        testQueue.add(test);
    }

    public BloodTest getNextTest() {
        return testQueue.poll();
    }

    public void addCancelled(BloodTest test) {
        if (cancelledQueue.size() >= 5) {
            cancelledQueue.poll();
        }
        cancelledQueue.add(test);
    }
}