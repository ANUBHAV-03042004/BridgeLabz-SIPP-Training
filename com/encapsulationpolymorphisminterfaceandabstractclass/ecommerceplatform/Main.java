package encapsulationpolymorphisminterfaceandabstractclass.ecommerceplatform;

public class Main {
public static void main(String args[])
{
	 Product[] cart = new Product[4];
     cart[0] = new Electronics(101, "Smartphone", 20000);
     cart[1] = new Clothing(102, "T-Shirt", 1000);
     cart[2] = new Groceries(103, "Wheat Flour", 500);
     cart[3] = new Electronics(104, "Laptop", 50000);

     for (Product product : cart) {
         System.out.println("---------------------------");
//         product.displayDetails();
         double discount = product.calculateDiscount();
         double tax = 0;

         if (product instanceof Taxable) {
             tax = ((Taxable) product).calculateTax();
             System.out.println(((Taxable) product).getTaxDetails());
         } else {
             System.out.println("No tax applicable.");
         }

         double finalPrice = product.getPrice() + tax - discount;
         System.out.println("Discount: Rs. " + discount);
         System.out.println("Tax: Rs. " + tax);
         System.out.println("Final Price: Rs. " + finalPrice);
     }
}
}
