import java.util.Scanner;

public class MainLaunch1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		
		int vcount=0,ccount=0;
		str =str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
				vcount++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				ccount++;
		}
		System.out.println("The total number of vowels :" +vcount);
		System.out.println("The total number of cosonants :" +ccount);
		
	}

}
