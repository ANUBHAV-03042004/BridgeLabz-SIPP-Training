package encapsulationpolymorphisminterfaceandabstractclass.ecommerceplatform;

abstract class Product {
//abstract variable;
private int productId;
private String name;
private double price;

Product(int productId,String name,double price)
{
	this.productId=productId;
	this.name=name;
	this.price=price;
}
public int getProductId() {
	return productId;
}
public String getName()
{
	return name;
}
public double getPrice() {
	return price;
}

//abstract method
public abstract double calculateDiscount();

}
