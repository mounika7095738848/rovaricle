import java.util.Arrays;

public class AlphabeticallyNames {

	public static void main(String[] args) {
		int n =4;
		String names[] = {"SachinTendulkar", "M.S.Dhoni","ViratKohli", "RohitSharma" };
		
		Arrays.sort(names);
		System.out.println("The names in alphabetical order are : ");
		
		for(int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
				
				
		}

}
