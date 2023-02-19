package defaultConstructor;

public class Student {
	int id;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student();
		s.display();
		s1.display();

	}

}
