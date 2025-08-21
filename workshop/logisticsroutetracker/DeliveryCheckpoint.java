package logisticsroutetracker;


// ---------------- DeliveryCheckpoint ----------------
class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String location, double dist, int expected, int actual) {
        super(id, location, dist, expected, actual);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "DeliveryCheckpoint"; }

    @Override
    public double calculatePenalty() {
        PenaltyCalculator calculator = (expected, actual) -> (actual - expected) * 2.0;
        return isDelayed() ? calculator.calculate(getExpectedDuration(), getActualDuration()) : 0.0;
    }
}
