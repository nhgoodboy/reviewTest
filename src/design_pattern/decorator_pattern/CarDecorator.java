package design_pattern.decorator_pattern;

public abstract class CarDecorator implements Car {

	private Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public void move() {
		this.car.move();
	}

}
