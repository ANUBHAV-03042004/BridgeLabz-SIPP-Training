package medicalrecordmanager;

class Prescription implements Searchable, Printable {
    String medicineList;

    Prescription(String medicineList) {
        this.medicineList = medicineList;
    }

    public void search(String keyword) {
        if (medicineList.contains(keyword)) {
            System.out.println("Medicine " + keyword + " found in Prescription!");
        } else {
            System.out.println("Medicine not found.");
        }
    }

    public void print() {
        System.out.println("Prescription: " + medicineList);
    }
}
