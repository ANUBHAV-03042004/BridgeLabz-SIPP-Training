package logisticsroutetracker;

// ---------------- RestCheckpoint ----------------
class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String location, double dist, int expected, int actual) {
        super(id, location, dist, expected, actual);
    }

    @Override
    public boolean isCritical() { return false; }

    @Override
    public String getType() { return "RestCheckpoint"; }

    @Override
    public double calculatePenalty() {
        PenaltyCalculator calculator = (expected, actual) -> (actual - expected) * 0.5;
        return (isDelayed() && (getActualDuration() - getExpectedDuration()) > 30)
                ? calculator.calculate(getExpectedDuration(), getActualDuration()) : 0.0;
    }
}


