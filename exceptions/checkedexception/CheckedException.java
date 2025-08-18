package checkedexception;

import java.io.*;

public class CheckedException {
 public static void main(String[] args) {
     try {
         FileReader fr = new FileReader("exceptions/checkedexception/data.txt");
         BufferedReader br = new BufferedReader(fr);

         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }

         br.close();
     } catch (IOException e) {
         System.out.println("File not found");
     }
 }
}

