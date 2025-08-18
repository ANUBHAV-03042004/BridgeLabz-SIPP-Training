package onlinestorecartsystem;
public class OnlineStoreCartSystem {
	 public static void main(String[] args) {
	     Cart cart = new Cart();
	     cart.addItem(new Item("Laptop", 800));
	     cart.addItem(new Item("Phone", 500));
	     cart.showCart();
	 }
	}
