package CopyConstructor;

public class Student {
	
	int id;
	String name;
	
	Student(int i,String n){
		id=i;
		name=n;
	}
	
	Student(Student s){
		id=s.id;
		name=s.name;
	}

	void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student(111,"Anu");
Student s1=new Student(s);

s.display();
s1.display();
	}

	

}
