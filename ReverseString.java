import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

public static void main(String[] args)
{
	int temp,size;
		
	   Scanner sc = new Scanner(System.in);
		
	   System.out.println("Enter a string : ");
		
	   String str = sc.nextLine();
		
	char charArray[] = str.toCharArray();
		
	    size = charArray.length;
		
	for(int i = 0; i < size; i++) 
{
	for(int j = i+1; j < size; j++)
{
	if(charArray[i]>charArray[j]);
{
	    temp = charArray[i];
				
		charArray[i] = charArray[j];
				
		 charArray[j] = (char)temp;
	}
}
	}
		System.out.println("Reverse String : " +Arrays.toString(charArray));
	}
}
