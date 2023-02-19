package SingleInheritance;

public class Animal {
	
	void eat() {
		
		System.out.println("eating....");	
	}
}

class Dog extends Animal{
	
	void bark() {
		
		System.out.println("barking....");
	}
}
class Test{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		d.bark();

	}

}
