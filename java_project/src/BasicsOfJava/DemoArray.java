package BasicsOfJava;

public class DemoArray {

	public static void main(String[] args) {
		
		String rak[] = new String[3];
		rak[0] = "cat";
		rak[1] = "bat";
		rak[2] = "rat";
		
		for(int i=0; i<rak.length; i++)
		{
			System.out.println("rak["+i+"] = "+rak[i]);
		}
		
		
		  int[] ar2 = new int[6]; 
		  ar2[0] = 34; 
		  ar2[1] = 35; 
		  ar2[2] = 36; 
		  ar2[3] = 37;
		  ar2[4] = 38; 
		  ar2[5] = 39;
		  
		  for(int j= 0; j<ar2.length; j++)
		  {
			  System.out.println("ar2 = "+ar2[j]);
		  }

		
		
		
		  int[] ar1 = {20, 30, 40, 50, 60};//creating an array and declaring values

		  for(int i=0; i<ar1.length; i++) 
		  { 
			  System.out.println(ar1[i]);
		  }

	}
}
