package Class;

class Student {
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	public int total;
	public double avg;
	
	public void total() {
		total = m1+m2+m3;
		System.out.println("Total Mark: "+total);
	}
	
	public void average() {
		avg = total/3;
		System.out.println("Average: "+avg);
	}
	
	public void grade() {
		if(avg>90) {
			System.out.println("A");
		}
	}
	
}

public class ClassForStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.roll = 123;
		s.name = "Ravi";
		s.course = "CSE";
		s.m1 = 97;
		s.m2 = 98;
		s.m3 = 100;
		
		s.total();
		s.average();
		s.grade();
		
	}

}
