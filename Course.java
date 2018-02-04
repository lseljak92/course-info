
public class Course {

	//Instance data variables
	private String name;
	private int maxCapacity;
	private int numTotalEnrolled;
	private Student[] roster;
	
	private final int MIN_CAPACITY = 0;
	
	
	//Constructor
	public Course(String name, int maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
		roster = new Student[maxCapacity];
		numTotalEnrolled = 0;
	}
	
	// getters
	public String getName() {
		return name;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public int getNumTotalEnrolled(){
		return numTotalEnrolled;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setMaxCapacity(int maxCapacity) {
		if(maxCapacity > MIN_CAPACITY){
			this.maxCapacity = maxCapacity;
		}
	}

	//To String
	public String toString() {
		String s = name + " (" + maxCapacity + " students capacity)";
		return s;
	}

	
	public boolean addStudent(Student s){
		boolean valid;
		if(numTotalEnrolled < maxCapacity && s.getTuiton()==true){
			for(int i = 0; i < 1; i++){
				roster[numTotalEnrolled] = s;
				numTotalEnrolled++;
			}
			valid = true;
		}else{
			System.out.println(s.getName() + " could not be added.");
			valid = false;
		}
		return valid;
	}
	public boolean dropStudent(Student s){
		boolean drop = true;
		for(int i = 0; i < roster.length; i++){
			if(roster[i].getName().equals(s.getName())){
				roster[i].setName(null);
				roster[i].setId(null);
				roster[i] = roster[maxCapacity-1];
				numTotalEnrolled--;
				drop = true;
			}else{
				drop = false;
			}
		}
		return drop;
		
	}
	public void printRoster(){
		if(numTotalEnrolled == 0){
			System.out.println("-- No students enrolled --");
		}else{
			System.out.println("Enrollment: " + numTotalEnrolled);
			for(int i = 0; i < numTotalEnrolled; i++){
				System.out.println(roster[i]);
			}
		}
	}
}		

	
	

