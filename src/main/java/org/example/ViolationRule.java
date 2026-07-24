package org.example;

public interface ViolationRule {
    Violation check(Observation observation);

    String getRule();
}
