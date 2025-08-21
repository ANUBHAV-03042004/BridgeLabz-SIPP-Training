package logisticsroutetracker;

import java.io.Serializable;

// ---------------- Abstract Checkpoint ----------------
abstract class Checkpoint implements Serializable {
    private String checkpointId;
    private String locationName;
    private double distanceFromLast; // in kilometers
    private int expectedDuration;    // in minutes
    private int actualDuration;      // in minutes

    public Checkpoint(String checkpointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public String getCheckpointId() { return checkpointId; }
    public String getLocationName() { return locationName; }
    public double getDistanceFromLast() { return distanceFromLast; }
    public int getExpectedDuration() { return expectedDuration; }
    public int getActualDuration() { return actualDuration; }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();

    @Override
    public String toString() {
        return getType() + " – " + locationName +
                (isDelayed() ? " – Delayed" : " – On Time") +
                " – Penalty: " + calculatePenalty();
    }
}
