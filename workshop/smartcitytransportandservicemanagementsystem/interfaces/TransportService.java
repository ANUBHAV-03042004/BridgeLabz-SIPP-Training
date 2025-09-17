package smartcitytransportandservicemanagementsystem.interfaces;


import java.util.List;
import smartcitytransportandservicemanagementsystem.model.Schedule;

public interface TransportService {
    String getServiceId();
    List<Schedule> getSchedules();

    default void printServiceDetails() {
        System.out.println("Service: " + getServiceId() + " | schedules:");
        getSchedules().forEach(s -> System.out.println("  - " + s));
    }

    default void log(String msg) {
        System.out.println("[" + getServiceId() + "] " + msg);
    }
}
