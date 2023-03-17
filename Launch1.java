

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   String st  = "iNeuron" , cst=" ";
    char ch;
    
   System.out.println("Input: iNeuron");
  
   System.out.println();
   
    for (int i=0; i < st.length(); i++)
    {
    	ch=st.charAt(i);
    	
    	cst= ch+cst;
    	
    }
      	
    System.out.println("Output: " + cst );
	
	}
	

}
