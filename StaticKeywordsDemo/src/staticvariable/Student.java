package staticvariable;

 class TestStaticVariable{
	
	int rollno;
	String name;
	static String college="ITS";
	
	TestStaticVariable(int r, String n){
		rollno=r;
		name=n;
		}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
 }
public class Student{
		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TestStaticVariable s1=new TestStaticVariable(100,"Anu");
		TestStaticVariable s2=new TestStaticVariable (101,"Aparna");
		s1.display();
		s2.display();

	}

	}

