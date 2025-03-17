/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Kevin
 */
public class BloodTest {
    private String name;
    private String priority;
    private String gpDetails;
    
    public BloodTest(String name, String priority, String gpDetails){
        this.name = name;
        this.priority = priority;
        this.gpDetails = gpDetails;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    @Override
    public String toString() {
        return "Blood Test for " + name + " (Priortiy: " + priority + ", GP:" + gpDetails + ")";
    }
}