package org.example;

public class PrivateSpeedRule implements ViolationRule{
    private final int fee;
    private static final int MAX_SPEED = 80;
    public static final String RULE_NAME = "PRIVATE_SPEED_LIMIT_EXCEEDED";

    public PrivateSpeedRule(int fee) {
        this.fee = fee;
    }

    @Override
    public Violation check(Observation observation) {
        if (observation.getCarType() == CarType.PRIVATE &&
                observation.getSpeed() > MAX_SPEED) {
            String description ="Speed of "+observation.getSpeed() +" exceeded max allowed speed ("+MAX_SPEED +")";
            return new Violation(RULE_NAME,description,fee);
        }
        return null;
    }

    @Override
    public String getRule() {
        return RULE_NAME;
    }
}
