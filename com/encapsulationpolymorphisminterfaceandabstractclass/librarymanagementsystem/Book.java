package encapsulationpolymorphisminterfaceandabstractclass.librarymanagementsystem;
import java.util.*;
public class Book extends LibraryItem implements Reservable {
	private int borrowerId;
	private double borrowerLoanAmount;
	private double amounttopay;
	private boolean hasreserved;
	private boolean hasavailable;
	Book(int itemId,String title,String author,String type,int borrowerId,double borrowerLoanAmount,double amounttopay,boolean hasreserved)
	{
		super(itemId,title,author,type);
		this.borrowerId=borrowerId;
		this.borrowerLoanAmount=borrowerLoanAmount;
		this.amounttopay=amounttopay;
		this.hasreserved=hasreserved;
	}
public int getborrowerId() {
	return borrowerId;
}
public double getborrowerLoanAmount() {
	return borrowerLoanAmount;
}
public double getamounttopay() {
	return amounttopay;
}
public boolean gethasreserved() {
	return hasreserved;
}

    @Override
	public int getLoanDuration()
	{
		return (int)Math.ceil(getborrowerLoanAmount()/getamounttopay());
	}
	
	@Override
	public boolean reserveItem() {
		return gethasreserved();
	}
	@Override
	public boolean checAvailabiltiy() {
		// TODO Auto-generated method stub
		return false;
	}

}
