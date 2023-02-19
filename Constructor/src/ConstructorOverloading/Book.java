package ConstructorOverloading;

public class Book {

	int id;
	String name;
	int price;
	
	Book(int bid, String bname){
		id=bid;
		name=bname;
	}
	Book(int bid, String bname, int bprice){
		id=bid;
		name=bname;
		price=bprice;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Book b=new Book(1,"A Little Book of India",700);
 Book b1=new Book(2,"Anti-Clock");
 b.display();
 b1.display();
 
	}

}
