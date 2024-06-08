public class Car {

	String model;
	String color;
	int year;

	void display() {
		System.out.println("Color: " + model);
		System.out.println("Model: " + color);
		System.out.println("year: " + year);
	}

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.model = "Red";
		car1.color = "Toyota";
		car1.year = 1989;
		
		car2.model = "Maruthi";
		car2.color = "navy blue";
		car2.year = 2022;
		
		
		car1.display();
		
		System.out.println(" ");
		
		car2.display();
	}
}