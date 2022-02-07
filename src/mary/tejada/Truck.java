package mary.tejada;

public class Truck extends Car{

	int weight;
	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight =weight;
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	double getSalePrice() {
		if (weight > 2000) {
			salePrice = regularPrice - regularPrice*0.10;
		}
		else {
			salePrice = regularPrice - regularPrice*0.20;
		}
		return salePrice;
	}// for this method implement this: If weight>2000, 10%discount. Otherwise, 20%discount.

}
