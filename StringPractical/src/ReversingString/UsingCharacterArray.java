package ReversingString;

public class UsingCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ABCDE";
String rev="";

char a[]=str.toCharArray();
int alength=a.length;

for(int i=alength-1;i>=0;i--) {
	
	rev=rev+a[i];
}
System.out.println("Revesed String is:"+rev);
	}

}
