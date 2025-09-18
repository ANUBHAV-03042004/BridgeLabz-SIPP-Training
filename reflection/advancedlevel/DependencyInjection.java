package advancedlevel;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void serve() { System.out.println("Service Executed"); }
}

class Client {
    @Inject
    Service service;
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();

        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                Object dep = f.getType().getDeclaredConstructor().newInstance();
                f.setAccessible(true);
                f.set(client, dep);
            }
        }

        client.service.serve();
    }
}
