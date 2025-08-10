package addressbookmanagementsystem;

import java.io.*;
import java.util.*;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String address;

    public Person(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | %s", name, email, phone, address);
    }
}
