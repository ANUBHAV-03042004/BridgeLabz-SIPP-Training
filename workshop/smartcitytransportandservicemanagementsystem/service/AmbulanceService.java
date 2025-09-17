package smartcitytransportandservicemanagementsystem.service;


import smartcitytransportandservicemanagementsystem.interfaces.EmergencyService;

public class AmbulanceService extends AbstractTransport implements EmergencyService {
    public AmbulanceService(String id) { super(id); }
}

