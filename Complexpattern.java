package Alien;

public class Complexpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			if(i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
			System.out.print("*");
			else
			System.out.print(" ");
			
			System.out.print(" ");
		}
	        System.out.print(" ");
		    for(int j=0;j<n;j++)
		{
			if(i-j>=(n-1)/2 || i+j>=(n-1)+n/2)
			System.out.print("*");
			else
			System.out.print(" ");
			
			System.out.print(" ");
		}	
			System.out.print(" ");	
		    for(int j=0;j<n;j++)
		{
			if(i+j<=(n-1)/2 || i-j>(n-1)/2 || i==0 || i==n-1)
			System.out.print("*");
			else
			System.out.print(" ");
			
			System.out.print(" ");
		
	      
		
		}
		    System.out.println();
		}	
		

	}

}
