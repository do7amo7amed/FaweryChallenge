package org.example;

import java.util.ArrayList;
import java.util.List;

public class Radar {
    private final List<ViolationRule>rules;
    private final List <Fine>fines;

    public Radar() {
        rules = new ArrayList<>();
        fines = new ArrayList<>();
    }

    public void addRule(ViolationRule rule) {
        rules.add(rule);
    }

    public void observe(Observation observation) {
        List<Violation> violations = new ArrayList<>();
        for (ViolationRule rule : rules) {
            Violation violation = rule.check(observation);
            if (violation != null) {
                violations.add(violation);
            }
        }
        if (!violations.isEmpty()) {
            fines.add(new Fine(observation.getPlateNumber(), violations));
        }
    }
    public List<Fine> getAllFines() {
        return fines;
    }
    public void printAllFines() {

        for (Fine fine : fines) {
            fine.printFine();
        }
    }

}
