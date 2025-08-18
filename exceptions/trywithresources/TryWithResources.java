package trywithresources;

import java.io.*;

public class TryWithResources{
 public static void main(String[] args) {
     try (BufferedReader br = new BufferedReader(new FileReader("exceptions/trywithresources/info.txt"))) {
         String line = br.readLine();
         System.out.println("First line: " + line);
     } catch (IOException e) {
         System.out.println("Error reading file");
     }
 }
}
