import java.util.Scanner;

public class Launch4 {
	
	private static Scanner sc;

	public static void main(String[] args)
	{
		String revStr;
		
		sc=new Scanner(System.in);
		
		System.out.print("\nPlease Enter any word or sentence = ");
		
		revStr = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(revStr);
		
		System.out.println("The result = " + sb.reverse());

	}

}
