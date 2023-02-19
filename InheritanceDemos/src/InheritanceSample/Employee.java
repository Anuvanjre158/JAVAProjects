package InheritanceSample;

public class Employee {
	
float salary=40000;

}

class Engineer extends Employee{
	
	int bonus=3000;
	
	public static void main(String args[]) {
		
		Engineer e=new Engineer();
		
		System.out.println("Engineer salary="+e.salary);
		System.out.println("Engineer bonus="+e.bonus);
	}
}