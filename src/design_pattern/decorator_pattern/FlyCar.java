package design_pattern.decorator_pattern;

public class FlyCar extends CarDecorator {

	public FlyCar(Car car) {
		super(car);
	}

	public void drivingInAir() {
		System.out.println("car is driving in the air");
	}
	
	@Override
	public void move() {
		super.move();
		drivingInAir();
	}
}
