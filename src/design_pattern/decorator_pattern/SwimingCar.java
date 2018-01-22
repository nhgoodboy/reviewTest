package design_pattern.decorator_pattern;

public class SwimingCar extends CarDecorator {

	public SwimingCar(Car car) {
		super(car);
	}
	
	public void drivingInWater() {
		System.out.println("car is driving in the water");
	}
	
	@Override
	public void move() {
		super.move();
		drivingInWater();
	}

}
