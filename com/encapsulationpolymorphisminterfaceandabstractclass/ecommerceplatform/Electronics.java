package encapsulationpolymorphisminterfaceandabstractclass.ecommerceplatform;

public class Electronics extends Product implements Taxable{
	Electronics(int productId,String name,double salary)
	{
		super(productId,name,salary);
	}

	@Override
	public double calculateDiscount() {
		return getPrice()*0.20;
	}

	@Override
	public double calculateTax() {
		return getPrice()*0.18;
	}

	@Override
	public String getTaxDetails() {
		return "GST (18%) on Electronics";
	}
}
