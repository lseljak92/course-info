import java.util.ArrayList;

public class CourseAL {


	//Instance data variables
		private String name;
		private int maxCapacity;
		private ArrayList<Student> studentList;
		
		private static double numTotalEnrolled = 0;
		
		public static final double DEFAULT_BALANCE = 0;
		
		public CourseAL(String name, int maxCapacity) {
			this.name = name;
			this.maxCapacity = maxCapacity;
			this.studentList = new ArrayList<Student>();
		}
		
		public static double getNumTotalEnrolled() {
			return numTotalEnrolled;
		}
		
		public String getName() {
			return name;
		}
		public int getMaxCapacity() {
			return maxCapacity;
		}
		
		
		public ArrayList<Student> getStudentList() {
			return studentList;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setMaxCapacity(int maxCapacity) {
			if(maxCapacity >= 0){
				this.maxCapacity = maxCapacity;
			}
		}
		
		public boolean addStudent(Student s) {
			if(numTotalEnrolled < maxCapacity && s.getTuiton() == true) {
				CourseAL.numTotalEnrolled ++;
				return studentList.add(s);
			} else {
				System.out.println("Student " + s.getName() + " could not be added.");
				return false;
			}
		}
		
		public boolean dropStudent(Student s) {
			if(studentList.contains(s)){
				return studentList.remove(s);
			}else{
				System.out.println("Student " + s.getName() + " is not in the roster.");
				return false;
			}
		}
		
		public void printRoster(){
			if(numTotalEnrolled == 0){
				System.out.println("-- No students enrolled --");
			}else{
				studentList.toString();
			}
		}
		
		public String toString() {
			String s = name + " (" + maxCapacity + " students capacity)";
			return s;
		}
		
}
