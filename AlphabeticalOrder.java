import java.util.Scanner;

public class AlphabeticalOrder {

public static void main(String[] args)
{
	int n;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("First Enter the number of which names you want to enter : ");
		n = sc.nextInt();
		String names[] =new String[n];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter all the names : ");
    for(int i = 0; i < n; i++) {
		names[i] = sc1.nextLine();
   } 
	for(int i = 0; i < n; i++)
  {
	for(int j = i + 1; j < n; j++)
  {
	 if(names[i].compareTo(names[j])>0)
  {
		 temp = names[i];
		 names[i] = names[j];
		 names[j] = temp;
	}
		}
			
	}
		System.out.print("Names in sorted order : ");
	 for(int i = 0; i < n - 1; i++) {
		System.out.print(names[i] + ",");
			
	}
		System.out.print(names[n - 1]);

	}

}
