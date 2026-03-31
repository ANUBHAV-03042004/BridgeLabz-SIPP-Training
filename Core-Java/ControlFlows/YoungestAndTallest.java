import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Ages
        System.out.print("Enter Amar's Age: ");
        int Amar_Age = sc.nextInt();
        System.out.print("Enter Akbar's Age: ");
        int Akbar_Age = sc.nextInt();
        System.out.print("Enter Anthony's Age: ");
        int Anthony_Age = sc.nextInt();
        
     // Read Height
        System.out.print("Enter Amar's Height in cm: ");
        int Amar_Height = sc.nextInt();
        System.out.print("Enter Akbar's Height in cm: ");
        int Akbar_Height = sc.nextInt();
        System.out.print("Enter Anthony's Height in cm: ");
        int Anthony_Height = sc.nextInt();
        
//        int Youngest = (Amar_Age < Akbar_Age) 
//                ? (Amar_Age < Anthony_Age ? Amar_Age : Anthony_Age)
//                : (Akbar_Age < Anthony_Age ? Akbar_Age : Anthony_Age);
//        String YoungestPerson = (Amar_Age < Akbar_Age)
//                ? (Amar_Age < Anthony_Age ? "Amar" : "Anthony")
//                : (Akbar_Age < Anthony_Age ? "Akbar" : "Anthony");
//
//
//        int Tallest=(Amar_Height < Akbar_Height) 
//                ? (Amar_Height < Anthony_Height ? Amar_Height : Anthony_Height)
//                : (Akbar_Height < Anthony_Height ? Akbar_Height : Anthony_Height);
//        String TallestPerson = (Amar_Height < Akbar_Height) 
//      ? (Amar_Height < Anthony_Height ?"Amar" : "Anthony")
//      : (Akbar_Height < Anthony_Height ? "Akbar" : "Anthony");
        
       if(Amar_Age<Akbar_Age)
       {
    	   if(Amar_Age<Anthony_Age)System.out.printf("Youngest Person is Amar with Age %d\n",Amar_Age);
    	   else System.out.printf("Youngest Person is Anthony with Age %d\n",Anthony_Age);
       }
       else {
    	   if(Akbar_Age<Anthony_Age) System.out.printf("Youngest Person is Akbar with Age %d\n",Akbar_Age);
    	   else System.out.printf("Youngest Person is Anthony with Age %d\n",Anthony_Age);
       }
       
       
       if(Amar_Height>Akbar_Height)
       {
    	   if(Amar_Height>Anthony_Height)System.out.printf("Tallest Person is Amar with Height %d\n",Amar_Height);
    	   else System.out.printf("Tallest Person is Anthony with Height %d\n",Anthony_Height);
       }
       else {
    	   if(Akbar_Height>Anthony_Height) System.out.printf("Tallest Person is Akbar with Height %d\n",Akbar_Height);
    	   else System.out.printf("Tallest Person is Anthony with Height %d\n",Anthony_Height);
       }

    }
}
