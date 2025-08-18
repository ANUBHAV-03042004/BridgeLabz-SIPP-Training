package emailfilteringsystem;

class Employee {
    private String name;
    private Email email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = new Email(email);
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', email='" + email.getEmailAddress() + "'}";
    }
}
