

  public class Launch3 {

  public  void reverseEachWordInString(String str1) {
		
	 String[] each_words =str1.split(" ");
	
	 String revString =" ";
	
  for(int i = 0; i < each_words.length; i++) 
  {
	 String word = each_words[i];
	 
	 String  reverseWord = " ";
	 
   for(int j = word.length() - 1; j>= 0; j--) 
  {
	 reverseWord = reverseWord + word.charAt(j);
   }
	 revString = revString + reverseWord + " ";
   }
	 System.out.println("output:" + revString);
   }
    public static void main(String[] args) {
		Launch3 obj = new Launch3();
		String StrGiven ="Think Twice";
		System.out.println("Input:   " + StrGiven);
		System.out.println();
		obj.reverseEachWordInString(StrGiven);
		
}
}
