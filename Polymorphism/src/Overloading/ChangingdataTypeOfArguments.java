package Overloading;

class Adder1{
	
	static int add(int a, int b) {
		return a+b;
	
	}
	
	static double add(double a,double b) {
		return a+b;
	}
}

class ChangingdataTypeOfArguments {
	
	public static void main(String[] args) {
		System.out.println(Adder1.add(5,6));
		System.out.println(Adder1.add(7.5, 3.3));
		
		
	}

}
