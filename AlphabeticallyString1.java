import java.util.Scanner;

public class AlphabeticallyString1
{

public static void main(String[] args) 
{
     Scanner in = new Scanner(System.in);
	 System.out.println("Enter a String : ");
	 String str = in.nextLine();
	 str = str.toLowerCase();
  int len = str.length();
		
	  String sortedStr = "";
   for(char ch = 'a'; ch <= 'z'; ch++)
  {
	for(int i = 0; i < len; i++)
 {
	char strCh = str.charAt(i);
	if(ch == strCh) 
	  {
		sortedStr += strCh;
		}
}
   }
		System.out.println("Alphabetical order : ");
		System.out.println();
		System.out.println(sortedStr);
		System.out.println();
		
		String filledStr = "";

	for(int i = 0; i < len -1 ; i++)
{
	char strCh = sortedStr.charAt(i);
		filledStr += strCh;
	for(int j = strCh + 1; j < sortedStr.charAt(i+1); j++)
	{
		filledStr += (char)j;
}
	}
		filledStr += sortedStr.charAt( len - 1);
		System.out.println("Filled String : " );
		System.out.println();
		System.out.println(filledStr);
	
		
	}
}