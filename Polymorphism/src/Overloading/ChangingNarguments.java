package Overloading;

class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}

class ChangingNarguments {
	
	public static void main(String[] args) {
		System.out.println(Adder.add(2, 3));
		System.out.println(Adder.add(2, 3,4));
	}

}
