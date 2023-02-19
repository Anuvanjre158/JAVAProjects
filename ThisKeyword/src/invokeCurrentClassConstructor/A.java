package invokeCurrentClassConstructor;

public class A {
	
	A(){
		System.out.println("Hellon A constructor");
	}
A(int x){
	this();
	System.out.println(x);
}
class TestThis{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A(10);
	}

}
}
