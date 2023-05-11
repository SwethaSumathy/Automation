
public class DemoArray {
	
	int a[]= {23,45,67,89,100,200};// 5//
	
	public void arrayDemo()
	{
		
//		System.out.println(a[0]);
//		System.out.println(a[3]);
//		System.out.println(a[5]);
//		System.out.println(a[1]);
//		System.out.println(a[6]);
		
		//length--> Field
		
//		System.out.println(a.length);
//		//using normal for loop
		for(int i=0;i<a.length;i++)//0<6
		{
			
			System.out.println(a[i]);//a[0]//23,45
		}
		
		//using enhanced for loop
		for(int s:a)
		{
			
			System.out.println(s);
		}
		
		
//		for(int i=a.length-1;i>=0;i--)//5//5>=0
//		{
//			System.out.println(a[i]);//a[5]
//			
//		}
	}
	public static void main(String[] args) {
		
		DemoArray d = new DemoArray();
		
		d.arrayDemo();
		
		
	}
	

}
