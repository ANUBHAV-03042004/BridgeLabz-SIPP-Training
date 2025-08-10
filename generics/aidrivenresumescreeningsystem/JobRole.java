package aidrivenresumescreeningsystem;

abstract class JobRole {
    private String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
