import java.util.Scanner;

public class SpecialCharacters {
private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i,alph,digi,spl;
		alph = digi = spl = 0;
		char ch;
		
		sc = new Scanner(System.in);
		
		System.out.print("\nplease Enter Alpha Numeric Special String = ");
		aldisp_str = sc.nextLine();
		
		for(i=0; i < aldisp_str.length(); i++) {
			ch = aldisp_str.charAt(i);
			if(Character.isDigit(ch)) {
				digi++;
			}
			else if(Character.isAlphabetic(ch)) {
				alph++;
			}else {
				spl++;
			}
		}
		System.out.println("\nNumber of Alphabetical Characters = " +alph);
		System.out.println("Number of Digital Characters = " +digi);
		System.out.println("Number of Special Characters = " +spl);
	}

}
