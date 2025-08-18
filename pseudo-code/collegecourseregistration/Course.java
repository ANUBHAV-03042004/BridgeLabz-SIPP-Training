package collegecourseregistration;

import java.util.Objects;

class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    @Override
    public String toString() {
        return code + ": " + title;
    }

    // required for HashMap key uniqueness
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course c = (Course) o;
        return code.equals(c.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
