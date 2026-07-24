package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Fine {
    private final String plateNumber;
    private List <Violation> violations;

    public Fine(String plateNumber,List<Violation> violations) {
        this.plateNumber = plateNumber;
        this.violations=violations;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public List<Violation> getViolations() {
        return violations;
    }
    public int getTotalAmount(){
        int totalAmount=0;
        for (Violation violation:violations)
        {
            totalAmount = totalAmount+ violation.getFee();
        }
        return totalAmount;
    }

    public void printFine() {

        System.out.println("Traffic for car " + plateNumber);
        System.out.println("Total amount: " + getTotalAmount() + " EGP");
        System.out.println("Violations:");
        for (Violation violation : violations) {
            System.out.println("- "+ violation.getDescription() + " : " + violation.getFee() + " EGP");
        }
    }

}
