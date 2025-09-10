package markupinterface.dataserializationforbackup;

import java.io.*;

public class DataSerializationForBackup{
 public static void main(String[] args) throws Exception {
     UserData user = new UserData("Anubhav", 22);

     if (user instanceof BackupSerializable) {
         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.dat"));
         out.writeObject(user);
         out.close();
         System.out.println("User data backed up.");
     }
 }
}
