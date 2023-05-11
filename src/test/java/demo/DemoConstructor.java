package demo;

public class DemoConstructor {
	int a;
	int b;//global variable
	
	DemoConstructor()// default constructor, no paramter constructor
	{
		
		a=20;
		b=40;
		System.out.println(a+b);
		
	}
	DemoConstructor(int a, int b)// default constructor, no paramter constructor
	{
		
		System.out.println(a-b);
		
	}
	
	
	public static void main(String[] args) {
		
		DemoConstructor d = new DemoConstructor();
		DemoConstructor d1=new DemoConstructor(30, 20);
		
		
	}
	

}
