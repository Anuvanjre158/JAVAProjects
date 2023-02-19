package Overloading;

class Overloading1{
	void sum(int a, long b) {
		System.out.println("int-long method invoked");
	}
	
	void sum(long a, int b) {
		System.out.println("double-long argument method invoked");
	}
}
public class Ambiguity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading o=new Overloading();
o.sum(7, 6);
	}

}
