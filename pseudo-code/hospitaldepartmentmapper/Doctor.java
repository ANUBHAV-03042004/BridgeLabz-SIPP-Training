package hospitaldepartmentmapper;

//Doctor class
class Doctor {
String name;
String specialization;

Doctor(String name, String specialization) {
   this.name = name;
   this.specialization = specialization;
}

@Override
public String toString() {
   return name + " (" + specialization + ")";
}
}
