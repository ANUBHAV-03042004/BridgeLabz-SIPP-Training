package collegecourseregistration;

class Student {
    private String name;
    private int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
