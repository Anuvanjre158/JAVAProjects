package Overloading;

class Overloading2{
	void sum(int a, int b) {
		System.out.println("int argument method invoked");
	}
	
	void sum(long a, long b) {
		System.out.println("long argument method invoked");
	}
}
public class MatchingTypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading2 o=new Overloading2();
o.sum(4, 5);
	}

}
