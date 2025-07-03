package encapsulationpolymorphisminterfaceandabstractclass.ecommerceplatform;

public class Clothing extends Product implements Taxable {
	Clothing(int productId,String name,double salary)
	{
		super(productId,name,salary);
	}

	@Override
	public double calculateDiscount() {
		return getPrice()*0.40;
	}

	@Override
	public double calculateTax() {
		return getPrice()*0.05;
	}

	@Override
	public String getTaxDetails() {
		return "GST (5%) on Clothing";
	}

}
