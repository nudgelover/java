package aggregation;

public class Human {
	private String name;
	private Car car; //"human은 car를 소유하고 있다"로 해석, 만약에 여러개면.. 배열쓰면되겠네? 근데 배열 말고 다른거 가르쳐주신다고 하심.
	public Human() {
	}
	
	public Human(String name) {
		this.name = name;
	}
	
	
	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public void drive() {
		car.go();
	}
	
	public void stopCar() {
		car.stop();
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}
	
	
}
