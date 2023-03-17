import java.util.Scanner;

public class RepeatedString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String str1 = sc.nextLine();
		
		int count;
		
		char str[] = str1.toCharArray();
		
		System.out.println("Repeated characters in the given string is: ");
		
		for(int i = 0; i < str.length; i++)
		{
			count = 1;
			
			for(int j = i+1; j < str.length; j++)
			{
				if(str[i] == str[j] &&  str[i] !=' ') 
				{
					count ++;
					
					str[j] = '0';
				}
			}
			if(count > 1 && str[i] != '0')
				
				System.out.println(str[i]);
		}
	}

}
