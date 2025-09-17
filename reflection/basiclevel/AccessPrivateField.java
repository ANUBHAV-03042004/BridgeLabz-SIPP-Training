package basiclevel;

import java.lang.reflect.*;

class Person {
    private int age = 25;
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field ageField = Person.class.getDeclaredField("age");

        ageField.setAccessible(true); // allow access
        System.out.println("Original Age: " + ageField.get(p));

        ageField.set(p, 40); // modify
        System.out.println("Modified Age: " + ageField.get(p));
    }
}
