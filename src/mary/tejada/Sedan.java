package mary.tejada;

public class Sedan extends Car{

	int length;
	double salePrice;
	
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length=length;
		
		// TODO Auto-generated constructor stub
	}
	
	public double getlength() {
		return length;
	}
	
	public void setlength(int length) {
		this.length = length;
	}
	
	
	
	@Override
	double getSalePrice() 
	{
		
		if (length > 20) {
			salePrice = regularPrice - regularPrice*0.05;
		}
		else {
			salePrice = regularPrice - regularPrice*0.10;
		}
		return salePrice;
	}
	 // for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount
	
}
