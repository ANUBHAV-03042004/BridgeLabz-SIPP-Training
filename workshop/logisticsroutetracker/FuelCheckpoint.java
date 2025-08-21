package logisticsroutetracker;

// ---------------- FuelCheckpoint ----------------
class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String location, double dist, int expected, int actual) {
        super(id, location, dist, expected, actual);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "FuelCheckpoint"; }

    @Override
    public double calculatePenalty() {
        PenaltyCalculator calculator = (expected, actual) -> 10.0;
        return isDelayed() ? calculator.calculate(getExpectedDuration(), getActualDuration()) : 0.0;
    }
}
