package encapsulationpolymorphisminterfaceandabstractclass.onlinefooddeliverysystem;


public class Main {
    public static void main(String[] args) {
        FoodItem[] cart = new FoodItem[3];
//        some inputs
        cart[0] = new VegItem("Paneer Butter Masala", 250, 2);
        cart[1] = new NonVegItem("Chicken Biryani", 300, 1);
        cart[2] = new VegItem("Dal Fry", 150, 3);

        double grandTotal = 0;

        for (FoodItem item : cart) {
            System.out.println("\n-----------------------------");
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalAmount = total - discount;
            System.out.println("Total Price: Rs. " + total);
            System.out.println("Discount: Rs. " + discount);
            System.out.println("Final Payable Amount: Rs. " + finalAmount);
            grandTotal += finalAmount;
        }

        System.out.println("\n==============================");
        System.out.println("Grand Total Payable: Rs. " + grandTotal);
        System.out.println("==============================");
    }
}
