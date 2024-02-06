package corejavaconcepts;

public class MobileTest {
	String name ;
	int id;
	
	
	public Phone getPhone() {   //Connection getConnection(); Samsung s = new Samsung(); return s ; (can return an instance of child class as well )
		Samsung s = new Samsung();
	
		return s;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

