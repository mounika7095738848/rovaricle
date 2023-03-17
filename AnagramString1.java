import java.util.Arrays;

public class AnagramString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Race";
		String str2 = "void";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() ==str2.length())
		{
			char[]charArray1 = str1.toCharArray();
			char[]charArray2 = str2.toCharArray();
			
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result)
			{
				System.out.println(str1 + " and " + str2 + " are anagram.");	
		}
			else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");	

	}
							
}
	System.out.println();
	String str3 = "Angered";
	String str4 = "Enraged";
	
	str3 = str3.toLowerCase();
	str4 = str4.toLowerCase();
	
	if(str3.length() ==str4.length())
	{
		char[]charArray3 = str3.toCharArray();
		char[]charArray4 = str4.toCharArray();
		
		
		Arrays.sort(charArray3);
		Arrays.sort(charArray4);
		
		boolean result = Arrays.equals(charArray3, charArray4);
		
		if(result)
		{
			System.out.println(str3 + " and " + str4 + " are anagram.");	
	}
		else {
			System.out.println(str3 + " and " + str4 + " are not anagram.");	

}
						
	
}


}
}