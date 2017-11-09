package t99.h03;

public class Student extends Human implements Passenger {

	private String name;
	private String destination;

	public Student(String name, String destination) {
		this.name = name;
		this.destination = destination;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDestination() {
		return destination;
	}
}
