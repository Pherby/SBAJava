package mary.tejada;

public class Ford extends Car{
	
	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getManDisc() {
		return manufacturerDiscount;
	}
	
	public void setManDisc(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	@Override
	double getSalePrice() 
	{
	double salePrice = regularPrice - manufacturerDiscount;		
	return salePrice;
	}
	 // for this method implement this: from the sale price computed from Car class, subtract the manufacturer Discount.
}
