package BasicsOfJava;

import java.util.Arrays;
public class ArraySortDesc {
	public static void main(String[] args) {

		int[] numAry = {21, 36, 15, 20, 45};
		for(int i=0; i<numAry.length; i++)
		{
			System.out.println();
			System.out.println("numAry["+i+"] = "+numAry[i]);
			for(int j=0; j<numAry.length; j++)
			{
				System.out.println("numAry[i] " + numAry[i] + " > numAry[j] "+numAry[j]);
				if(numAry[i] < numAry[j])
				{
					int m = numAry[j];
					numAry[j] = numAry[i];
					numAry[i] = m;
				}
				String s1 = Arrays.toString(numAry);
				System.out.println("array loop j = "+j+" is = "+s1);
			}
		}
		//print the array
		System.out.println("\n");
		System.out.println("the contents of the sorted array kj is");
		for(int i=0; i<numAry.length;i++)
		{
			System.out.println(numAry[i]);
		}	
	}
}
