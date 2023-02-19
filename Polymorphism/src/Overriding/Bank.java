package Overriding;

public class Bank {

	int getRateOfInterest() {
		return 0;
	}
}	
class SBI extends Bank{
	
	int getRateOfInterest() {
		return 5;
	}
}
class HDFC extends Bank{
	
	int getRateOfInterest() {
		return 6;
	}
}
class Axis extends Bank{
	
	int getRateOfInterest() {
		return 7;
	}
}

class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI s=new SBI();
HDFC h=new HDFC();
Axis a=new Axis();

System.out.println("SBI:"+s.getRateOfInterest());
System.out.println("HDFC:"+h.getRateOfInterest());
System.out.println("Axis:"+a.getRateOfInterest());

	}

}
