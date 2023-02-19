package SimpleExample;

class Operation{
	int square(int n) {
		return n*n;
	}
}

class Circle{
	Operation op;
	double pi=3.14;
	
double area(int r) {
	op=new Operation();

	int resultsquare=op.square(r);
	return pi*resultsquare;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle();
double result=c.area(10);
System.out.println(result);
	}

}
