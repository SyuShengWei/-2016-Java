
public class Invoice implements Payable{
	
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
		if (quantity < 0)
			throw new IllegalArgumentException("Quantity must be >= 0");
		if (pricePerItem < 0.0)
			throw new IllegalArgumentException("Price per item must be >= 0");
		this.quantity = quantity;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
	}

	public void setQuantity(int quantity){
		if (quantity < 0)
			throw new IllegalArgumentException("Quantity must be >= 0");
		this.quantity = quantity;
	}

	public void setPricePerItem(double pricePerItem){
		if (pricePerItem < 0.0)
			throw new IllegalArgumentException("Price per item must be >= 0");
		this.pricePerItem = pricePerItem;
	}
	public String getPartNumber()	  {return this.partNumber;}
	public String getPartDescription(){return this.partDescription;}
	public int getQuantity()          {return this.quantity;}
	public double getPricePerItem()	  {return this.pricePerItem;}
	@Override
	public double getPaymentAmount(){return getQuantity() * getPricePerItem();}
	@Override
	public String getClassName(){return "Invoice";}
	@Override
	public String toString(){
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f\n",
				"Invoice", 
				"Part Number", getPartNumber(), getPartDescription(), 
				"Quantity", getQuantity(),
				"Price per item", getPricePerItem());
	}

}

