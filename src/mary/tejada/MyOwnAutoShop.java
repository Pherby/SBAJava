package mary.tejada;

public class MyOwnAutoShop {
	
	
	static Sedan sedan = new Sedan(150, 10000, "Red", 40);
	static Ford ford1 = new Ford(200, 25000, "Blue", 2020, 2000);
	static Ford ford2 = new Ford(70, 3000, "Silver", 2000, 200);
	static Car car = new Car(100, 44000, "Black");
	
	
	
	public static void main(String[] args) {
		
		
		//test1();
		System.out.println("Sedan Sales Price: " + sedan.getSalePrice());
		//test2();
		System.out.println("Ford #1 Sales Price: " + ford1.getSalePrice());
		//test3();
		System.out.println("Ford #1 Sales Price: " + ford2.getSalePrice());
		//test4();
		System.out.println("Car Sales Price: " + car.getSalePrice());
	}

//	static void test1() {
//		sedan.setRegularPrice(10000);
//		sedan.setSpeed(150);
//		sedan.setlength(40);
//		sedan.setColor("Red");
//		sedan.getSalePrice();
//	}
//	
//	static void test2() {
//		ford1.setRegularPrice(25000);
//		ford1.setSpeed(200);
//		ford1.setManDisc(200);
//		ford1.setColor("Blue");
//		ford1.getSalePrice();
//	}
//	
//	static void test3() {
//		ford2.setRegularPrice(3000);
//		ford2.setSpeed(70);
//		ford2.setManDisc(40);
//		ford2.setColor("Silver");
//		ford2.getSalePrice();
//	}
//	
//	
//	static void test4() {
//		car.setRegularPrice(44000);
//		car.setSpeed(100);
//		car.setColor("Black");
//		car.getSalePrice();
//	}
}
