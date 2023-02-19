package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> vehicles= new ArrayList();
vehicles.add("Car");
vehicles.add("Bus");
vehicles.add("Truck");
vehicles.add("Bike");

Iterator<String> iterator=vehicles.iterator();
while(iterator.hasNext()) {
	String vehicle= (String)iterator.next();
    System.out.println(vehicle);
    
    if("Car".equals(vehicle)) {
    	iterator.remove();
    }

}
System.out.println(vehicles);
	}

}
