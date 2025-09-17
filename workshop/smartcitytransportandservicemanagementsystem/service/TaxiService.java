package smartcitytransportandservicemanagementsystem.service;

import smartcitytransportandservicemanagementsystem.interfaces.EmergencyService;

public class TaxiService extends AbstractTransport implements EmergencyService {
    public TaxiService(String serviceId) { super(serviceId); }

    @Override
    public void log(String msg) {
        System.out.println("[TAXI-" + getServiceId() + " PRIORITY] " + msg);
    }
}

