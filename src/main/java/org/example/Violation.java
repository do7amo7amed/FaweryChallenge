package org.example;

import java.math.BigDecimal;

public class Violation {
    private final String  rule;
    private final String description;
    private final int fee;

    //Constructor
    public Violation(String rule, String description, int fee) {
        this.rule = rule;
        this.description = description;
        this.fee = fee;
    }
    //Getter
    public String getRule() {
        return rule;
    }

    public String getDescription() {
        return description;
    }

    public int getFee() {
        return fee;
    }
}
