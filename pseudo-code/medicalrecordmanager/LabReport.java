package medicalrecordmanager;

class LabReport implements Searchable, Printable {
    String reportDetails;

    LabReport(String reportDetails) {
        this.reportDetails = reportDetails;
    }

    public void search(String keyword) {
        if (reportDetails.contains(keyword)) {
            System.out.println("Keyword found in Lab Report!");
        } else {
            System.out.println("Keyword not found in Lab Report.");
        }
    }

    public void print() {
        System.out.println("Lab Report: " + reportDetails);
    }
}
