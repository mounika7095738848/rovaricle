import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticallyString {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string  : ");
		String str = sc.nextLine();
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println();
		System.out.println("Alphabetical order is : " +new String(charArray) );
		
	 
}
}