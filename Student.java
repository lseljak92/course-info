
public class Student {

	
	//Instance data variables
	private String name, id;
	private boolean tuiton;
	
	private final boolean DEFAULT_TUITON_STATUS = true;
	
	
	//Constructor
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		tuiton = DEFAULT_TUITON_STATUS;
	}
	
	// getters
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public boolean getTuiton() {
		return tuiton;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTuiton(boolean tuiton) {
		this.tuiton = tuiton;
	}

	//To String
	public String toString() {
		String s = "Name: " + name +
				"\nID: " + id + 
				"\nTuiton: " + tuiton; 
				
		return s;
	}
}
	