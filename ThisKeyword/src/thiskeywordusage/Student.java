package thiskeywordusage;

class Student {
	
int rollno;
String name;
float fee;

Student(int rollno, String name, float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	
}

void display() {
	System.out.println(rollno+" "+name+ " "+fee);
}
}
class Test{

public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student(1,"Anu",3000f);
Student s1=new Student(2,"Akshay",6000f);
s1.display();
s.display();
	}

}
