
public class DemoTwoDimension {
	
	int a[][]=
		{
				{23,45,67},
				{34,78,90},
				{21,34,80}
				
				
		};
	
	public void demoTwo()
	{
		
		System.out.println(a.length);
		
//		for(int row=0;row<3;row++)//0<3
//		{
//			
//			for(int col=0;col<3;col++)//0<3
//			{
//				
//				System.out.print(a[row][col]+" ");//a[0][0]
//				
//			}
//			
//			System.out.println();
//		}
		
		
		for (int[] e : a) {
			
			for (int i : e) {
				
				System.out.print(i+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		DemoTwoDimension t = new DemoTwoDimension();
		t.demoTwo();
		
	}
	

}
