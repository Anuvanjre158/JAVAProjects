package constructorChaining;

public class Student {
	int rollno;
	String name;
	String course;
	float fee;

	Student(int rollno, String name, String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student (int rollno, String name, String course,float fee){
		this(rollno,name,course);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Kiran","java");
		Student s1=new Student(2,"Madhu","java",2000f);
s.display();
s1.display();
	}

}
