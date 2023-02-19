package currentclassmethod;

 class A {
	 
	 void m() {
		 
		System.out.println("Hello method m()");
	 }

	 void n() {
		 System.out.println("Hello method n()");
		 m();
		 this.m();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.n();

	}

}
