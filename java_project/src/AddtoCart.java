import java.util.Scanner;

public class AddtoCart {
	public static void main(String[] args) {
		Scanner csn = new Scanner(System.in);
		System.out.println("enter the products");
		String[] items = new String[4];
		for(int i=0;i<items.length;i++)
		{
			items[i] = csn.next();
		}
		
		int numItems = addTocart(items);
		int totalAmt = calculateTotal(numItems);
		System.out.println("total amount to paid = Rs."+totalAmt+"/-");
	}

	static int calculateTotal(int numItems) {
		int total = 100*numItems;
		return total;
	}

	static int addTocart(String[] items) 
	{
		for(int i=0;i<items.length;i++)
		{
		System.out.println(items[i]+" - item added to cart");
		}
		return items.length;
	}
}
