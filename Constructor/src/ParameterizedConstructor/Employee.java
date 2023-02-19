package ParameterizedConstructor;

public class Employee {
 
	int eid;
	String ename;
	
	Employee(int id, String name){
		eid=id;
		ename=name;
	}
	
	void display() {
		System.out.println(eid+" "+ename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee e1=new Employee(1,"Anu");
 Employee e2=new Employee(2,"Arjun");
 e1.display();
 e2.display();
	}

}
