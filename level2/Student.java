	public class Student{
		String name;
		int rollNumber;
		int marks;
		char grades;
		
		public void Student(String name, int rollNumber, int marks){
			this.name = name;
			this.marks = marks;
			this.rollNumber = rollNumber;
		}
		public void grades(){
			if(marks>75) grades = 'A';
			else if(marks>50) grades = 'B';
			else if(marks>35) grades = 'C';
			else grades = 'D';
		}
		public void display(){
				System.out.println("Name: "+name);
				System.out.println("rollNumber: "+rollNumber);
				System.out.println("marks: "+marks);
				System.out.println("Grade: "+grades);
		}
		
	}