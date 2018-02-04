
public class studentTester {

	public static void main(String[] args) {
		
		//Course that with 5 students capacity
		Course visualMedia = new Course("Visual Media", 5);
		
		//Array that holds a total of seven students
		Student [] arrayStudents = new Student[7];
		
		//Students objects
		arrayStudents [0] = new Student("Jon Adams", "W1585");
		arrayStudents [1] = new Student("Rose Parker", "D5820");
		arrayStudents [2] = new Student("Jack Heldens", "E5423");
		arrayStudents [3] = new Student("Zoe Graham", "H5644");
		arrayStudents [4] = new Student("Peter Johnson", "Y6543");
		arrayStudents [5] = new Student("Jordan Locke", "54A56");
		arrayStudents [6] = new Student("Peter Bach", "54A56");
		
		//Print course
		System.out.println(visualMedia.toString());
		
		//Prints roster
		visualMedia.printRoster();
				
		//Add the first five students to the roster		
		visualMedia.addStudent(arrayStudents[0]);
		visualMedia.addStudent(arrayStudents[1]);
		visualMedia.addStudent(arrayStudents[2]);
		visualMedia.addStudent(arrayStudents[3]);
		visualMedia.addStudent(arrayStudents[4]);
		
		//Print roster
		visualMedia.printRoster();
		System.out.println("");
		
		//Try adding one more student to the list (it will exceed the max capacity)
		visualMedia.addStudent(arrayStudents[5]);
		visualMedia.printRoster();
		
		
		System.out.println("Drop ");		
		//Drops the third student from the roster
		visualMedia.dropStudent(arrayStudents[2]);
		visualMedia.printRoster();
		
		System.out.println(" ");
		//Add another one
		visualMedia.addStudent(arrayStudents[5]);
		visualMedia.printRoster();
		
		
	}

}
