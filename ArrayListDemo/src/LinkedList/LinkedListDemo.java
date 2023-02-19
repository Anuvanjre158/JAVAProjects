package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add("Anu");
l.add(30);
l.add(null);
l.add("Anu");
System.out.println(l);
l.set(0, "DXC");
System.out.println(l);
l.add(40);
l.add(0,"AAA");
System.out.println(l);
l.removeLast();
l.addFirst("BB");
System.out.println(l);

	}

}
