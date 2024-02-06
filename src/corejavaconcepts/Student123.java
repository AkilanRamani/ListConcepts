package corejavaconcepts;

public class Student123 {

	public Student123(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String name;
	public String address;
	@Override
	public String toString() {
		return "Student123 [name=" + name + ", address=" + address + "]";
	}
}
