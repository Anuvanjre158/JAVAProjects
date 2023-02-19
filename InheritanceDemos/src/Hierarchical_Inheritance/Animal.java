package Hierarchical_Inheritance;

public class Animal {
void eat() {
	System.out.println("eating...");
	
}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking...");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("meowing...");
		
	}
}
class Test {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.meow();
		//c.bark();
		c.eat();
		
	}
}