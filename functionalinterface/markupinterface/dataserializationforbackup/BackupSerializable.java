package markupinterface.dataserializationforbackup;

import java.io.Serializable;

//Marker interface (no methods)
interface BackupSerializable {}

class UserData implements Serializable, BackupSerializable {
String name;
int age;
UserData(String name, int age) { this.name = name; this.age = age; }
}