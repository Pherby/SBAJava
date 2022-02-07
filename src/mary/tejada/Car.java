package mary.tejada;

public class Car {
	int speed;
	double regularPrice;
	double salePrice;
	String color;
	
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
		
	}
	
	double getRegularPrice() 
	{
	return  regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
	this.regularPrice=regularPrice;
	}
	
	double getSalePrice() 
	{
	return  regularPrice;
	}
	
	public void setSalePrice(double salePrice) {
		this.salePrice=regularPrice;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor (String color) {
		this.color= color;
	}
}
