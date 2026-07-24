package org.example;


public class SeatbeltRule implements ViolationRule {
    private final int fee;
    private static final String RULE_NAME = "SEATBELT_NOT_FASTENED";

    public SeatbeltRule(int fee) {
        this.fee = fee;
    }

    @Override
    public Violation check(Observation observation) {
        if (!observation.isBeltFastened()) {
            String description = "Seatbelt not fastened";
            return new Violation(RULE_NAME,description ,fee);
        }
        return null;
    }

        @Override
        public String getRule () {
            return RULE_NAME;
        }
    }
