package logisticsroutetracker;

// ---------------- Functional Interface ----------------
@FunctionalInterface
interface PenaltyCalculator {
    double calculate(int expected, int actual);
}