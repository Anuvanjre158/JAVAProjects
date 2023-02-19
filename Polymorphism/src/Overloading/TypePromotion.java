package Overloading;

class Overloading{
	void sum(int a, long b) {
		System.out.println(a+b);
	}
	
	void sum(int a, int b,int c) {
		System.out.println(a+b+c);
	}
}
public class TypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.sum(10, 15);
		o.sum(10, 20,30);

	}

}
