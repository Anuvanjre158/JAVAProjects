// Print Duplicate Characters from String

package Duplicate;

public class DuplucateChar {

	public static void main(String [] args) {
		String str="Annapoorna";
		
		int length=str.length();
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<length;i++) {
			
			for(int j=0;j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate characters are:"+ch[j]);
					break;
				}
			}
		}
	
	}
}
