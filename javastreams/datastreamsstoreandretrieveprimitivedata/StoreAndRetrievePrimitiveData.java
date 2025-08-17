package datastreamsstoreandretrieveprimitivedata;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class StoreAndRetrievePrimitiveData {
    public static void main(String[] args) {
        String fileName = "javastreams/datastreamsstoreandretrieveprimitivedata/output.txt";

        // Writing data to binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing student details (rollNo, name, GPA)
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(8.5);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(9.2);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(7.8);

            System.out.println("✅ Data written successfully to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data back
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\n📌 Student Details (Read from file):");
            while (dis.available() > 0) {  // read until EOF
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 