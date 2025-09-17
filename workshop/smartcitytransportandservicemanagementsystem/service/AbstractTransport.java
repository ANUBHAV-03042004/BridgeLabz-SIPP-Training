package smartcitytransportandservicemanagementsystem.service;

import java.util.*;
import smartcitytransportandservicemanagementsystem.interfaces.TransportService;
import smartcitytransportandservicemanagementsystem.model.Schedule;

public abstract class AbstractTransport implements TransportService {
    protected final String serviceId;
    protected final List<Schedule> schedules = new ArrayList<>();

    public AbstractTransport(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() { return serviceId; }

    @Override
    public List<Schedule> getSchedules() { return schedules; }

    public void addSchedule(Schedule s) { schedules.add(s); }
}
