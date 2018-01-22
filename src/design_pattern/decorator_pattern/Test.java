package design_pattern.decorator_pattern;

public class Test {

	public static void main(String[] args) {
		Car car = new CarImpl();
		car.move();
		System.out.println("------------");
		CarDecorator fly = new FlyCar(car);
		fly.move();
		System.out.println("------------");
		CarDecorator swiming = new SwimingCar(car);
		swiming.move();
		System.out.println("------------");
		CarDecorator flyAndSwiming = new FlyCar(new SwimingCar(car));
		flyAndSwiming.move();
	}
}
