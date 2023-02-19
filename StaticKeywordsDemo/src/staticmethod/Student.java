package staticmethod;

public class Student {
	int rollno;
	String name;
	static String college="UBDT";

	Student(int r, String n){
		rollno=r;
		name=n;
	}
	static void change() {
		college="BIET";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.change();
		
		Student s1=new Student(1,"Anu");
		Student s2=new Student(2,"Shanti");
		Student s3=new Student(3,"Harikrishna");
		s1.display();
		s2.display();
		s3.display();
		s1.change();
		s1.display();

	}

}
