package ReversingString;

public class UsingStringContatenitionOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="ABCD";
	String rev="";
	int length=str.length();
	for(int i=length-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
		
	}
	System.out.println("Reversed String:"+rev);
}
	}


