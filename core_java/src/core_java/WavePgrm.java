package core_java;

public class WavePgrm 
{
public static void main(String[] args) {
	int wave_height=4;
	int wave_length=4;
	int i,j,k;
	for(i=1;i<=wave_height;i++) {
		for(j=1;j<=wave_length;j++) {
			if(i!=wave_height)
			{
				System.out.print(" ");
			}else
			{
				System.out.print("* ");
			}
			for(k=1;k<=4;k++)
			{
				if(i==1||k==1||k==4)
				{
					System.out.print("* ");
				}else
				{
					System.out.print(" ");
				}
			}
			if(i!=wave_height)
			{
				System.out.print(" ");
			
			}else
			{
				System.out.print("* ");
			}
		}
		System.out.print("\n");
	}
}
}
