package EmployeeAddressHasARelationship;

public class Employee {
	
	int eid;
	String name;
	Address address;
	

	public Employee(int eid, String name, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}

void display() {
	
	System.out.println(eid+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address a1= new Address("Bengaluru","Karnataka","India");
Address a2=new Address("Kocchi","Kerala","India");
Address a3=new Address("Chennai","Tamilnadu","India");

Employee e1=new Employee(1,"Anu",a1);
Employee e2=new Employee(2,"Kiran",a2);
Employee e3=new Employee(3,"Madhu",a3);

e1.display();
e2.display();
e3.display();
	}

}
