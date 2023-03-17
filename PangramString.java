
import java.util.HashSet;

public class PangramString {

	public static void main(String[] args) {
		
	String inputString = "Do you know how many total keywords present in java";
	
	inputString = inputString.toLowerCase().replaceAll(" ", "");
	char[]arr = inputString.toCharArray();
	
	HashSet<Character>set1 = new HashSet<>();
	
	for(char ch : arr)
	{
		set1.add(ch);
	}
	if(set1.size() == 26)
		System.out.println("Input String 1 is Pangram");
	else
		System.out.println("Input String 1 is Not Pangram");
	
	System.out.println();

	String inputString1 = "The quick Brown fox jumps over a Lazy Dog";
	
	inputString1 = inputString1.toLowerCase().replaceAll(" ", "");
	
	char[]arr1 = inputString1.toCharArray();
	
	HashSet<Character>set2 = new HashSet<>();
	
	
	for(char ch : arr1)
	{
		set2.add(ch);
	}
	if(set2.size() == 26)
		System.out.println("Input String 2 is Pangram");
	else
		System.out.println("Input String 2 is Not Pangram");
			
	}

}
