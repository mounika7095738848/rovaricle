import java.util.Scanner;


class Guesserobject
{
  int guessNum;
  public int guessNumber()
  {
	Scanner scan = new Scanner(System.in);
    System.out.println("GUESSER PLEASE GUESS ANY TWO DIGIT NUMBERS ");
	guessNum=scan.nextInt(); 
	if(guessNum<20);
	else {
		System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
		System.out.println("IT'S OK TRY AGAIN");
		System.out.println("AGAIN GUESSER PLEASE GUESS THE NUMBER BELOW 20 ONLY");
	}
	guessNum=scan.nextInt();
   return guessNum;
  }
  
}
class Players
{
  int pguessNum;
  public int guessNumber()
  {
   Scanner scan = new Scanner(System.in);
   System.out.println("PLAYER PLEASE GUESS THE TWO DIGIT NUMBER");	
   pguessNum=scan.nextInt();
   if(pguessNum<20);
   else 
   {
	   System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
		System.out.println("IT'S OK TRY LATER");
		System.out.println("AGAIN PLEASE GUESS THE NUMBER 20 ONLY");
   }
   pguessNum=scan.nextInt();
   return pguessNum;
	}
}
class Umpire2
{
	int numFromGuesserobject;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	int numFromPlayer5;
	
	public void collectNumFromGuesserobject()
	{
		Guesserobject g=new Guesserobject();
		numFromGuesserobject=g.guessNumber();
		
		
	}
	public void collectNumFromPlayers()
	{
		player p1=new player();
		player p2=new player();
		player p3=new player();
		player p4=new player();
		player p5=new player();
		
		numFromPlayer1=p1.guessNumber();
		if(numFromPlayer1<20);
		else 
		{
			System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
			System.out.println("IT'S OK TRY LATER");
		}
		numFromPlayer2=p2.guessNumber();
		if(numFromPlayer2<20);
		else 
		{
			System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
			System.out.println("IT'S OK TRY LATER");
		}
		numFromPlayer3=p3.guessNumber();
		if(numFromPlayer3<20);
		else 
		{
			System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
			System.out.println("IT'S OK TRY LATER");
		}
		numFromPlayer4=p4.guessNumber();
		if(numFromPlayer4<20);
		else 
		{
			System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
			System.out.println("IT'S OK TRY LATER");
		}
		numFromPlayer5=p5.guessNumber();
		if(numFromPlayer5<20);
		else 
		{
			System.out.println("SORRY,YOU CAN GUESS THE NUMBER BELOW 20 ONLY");
			System.out.println("IT'S OK TRY LATER");
		}
	}
	void compare() 
	{
	if(numFromGuesserobject==numFromPlayer1) 
   {  
	if(numFromGuesserobject==numFromPlayer2 && numFromGuesserobject== numFromPlayer3 && numFromGuesserobject== numFromPlayer4 && numFromGuesserobject== numFromPlayer5)
	{
		System.out.println("GAME TIED ALL FIVE PLAYERS GUESSED CORRECTLY");
		
	}
	else if( numFromGuesserobject== numFromPlayer3 && numFromGuesserobject== numFromPlayer4 && numFromGuesserobject== numFromPlayer5)
	{
		System.out.println("PLAYER 1 AND PLAYER 3 AND PLAYER 4 AND PLAYER 5 ARE WON THE GAME ");
		
	}
	else if( numFromGuesserobject== numFromPlayer2 && numFromGuesserobject== numFromPlayer4 && numFromGuesserobject== numFromPlayer5)
	{
		System.out.println("PLAYER 1 AND PLAYER 2 AND PLAYER 4 AND PLAYER 5 ARE WON THE GAME ");
		
	}
	else if( numFromGuesserobject== numFromPlayer2 && numFromGuesserobject== numFromPlayer3 && numFromGuesserobject== numFromPlayer5)
	{
		System.out.println("PLAYER 1 AND PLAYER 2 AND PLAYER 3 AND PLAYER 5 ARE WON THE GAME ");
		
	}
	else if( numFromGuesserobject== numFromPlayer2 && numFromGuesserobject== numFromPlayer3 && numFromGuesserobject== numFromPlayer4)
	{
		System.out.println("PLAYER 1 AND PLAYER 2 AND PLAYER 3 AND PLAYER 4 ARE WON THE GAME ");
		
	}
	else if( numFromGuesserobject== numFromPlayer2 && numFromGuesserobject== numFromPlayer3) 
	{
		System.out.println("PLAYER 1  AND PLAYER 2 AND PLAYER 3 ARE WON THE GAME");
	}	
	
	else if( numFromGuesserobject== numFromPlayer3 && numFromGuesserobject== numFromPlayer4) 
	{
		System.out.println("PLAYER 1  AND PLAYER 3 AND PLAYER 4 ARE WON THE GAME");
	}
	else if( numFromGuesserobject== numFromPlayer2 && numFromGuesserobject== numFromPlayer5) 
	{
		System.out.println("PLAYER 1  AND PLAYER 2 AND PLAYER 5 ARE WON THE GAME");
	}
	else if( numFromGuesserobject== numFromPlayer2 && numFromGuesserobject== numFromPlayer4) 
	{
		System.out.println("PLAYER 1  AND PLAYER 2 AND PLAYER 4 ARE WON THE GAME");
	}
	else if( numFromGuesserobject== numFromPlayer4 && numFromGuesserobject== numFromPlayer5) 
	{
		System.out.println("PLAYER 1  AND PLAYER 4 AND PLAYER 5 ARE WON THE GAME");
	}
	else if( numFromGuesserobject== numFromPlayer3 && numFromGuesserobject== numFromPlayer5) 
	{
		System.out.println("PLAYER 1  AND PLAYER 3 AND PLAYER 5 ARE WON THE GAME");
	}
	else if(numFromGuesserobject==numFromPlayer2)
	{
		System.out.println("PLAYER 1 AND PLAYER 2 WON THE GAME");
	}
	
	else if(numFromGuesserobject==numFromPlayer3)
	{
		System.out.println("PLAYER 1 AND PLAYER 3 WON THE GAME");
	}
	else if(numFromGuesserobject==numFromPlayer4)
	{
		System.out.println("PLAYER 1 AND PLAYER 4 WON THE GAME");
	}
	else if(numFromGuesserobject==numFromPlayer5)
	{
		System.out.println("PLAYER 1 AND PLAYER 5 WON THE GAME");
	}
	else
	{
		System.out.println("PLAYER 1 WON THE GAME");
	}
}
else if(numFromGuesserobject==numFromPlayer2)
{
	if(numFromGuesserobject==numFromPlayer3  && numFromGuesserobject== numFromPlayer4 && numFromGuesserobject== numFromPlayer5)
	 
	{
		System.out.println("PLAYER 2 AND PLAYER 3 AND PLAYER 4 AND PLAYER 5 WON THE GAME");
	}
	else if(numFromGuesserobject==numFromPlayer3  && numFromGuesserobject== numFromPlayer4 )
		 
		{
			System.out.println("PLAYER 2 AND PLAYER 3 AND PLAYER 4  WON THE GAME");
		}
	else if(numFromGuesserobject==numFromPlayer3  && numFromGuesserobject== numFromPlayer5 )
			 
			{
				System.out.println("PLAYER 2 AND PLAYER 3 AND PLAYER 5  WON THE GAME");
			}
	else if(numFromGuesserobject==numFromPlayer4  && numFromGuesserobject== numFromPlayer5 )
				 
			{
				System.out.println("PLAYER 2 AND PLAYER 4 AND PLAYER 5  WON THE GAME");
			}
	else if(numFromGuesserobject==numFromPlayer3)
	{
		System.out.println("PLAYER 2 AND PLAYER 3 WON THE GAME");
		
	}
	else if(numFromGuesserobject==numFromPlayer4)
	{
		System.out.println("PLAYER 2 AND PLAYER 4 WON THE GAME");
		
	}
	else if(numFromGuesserobject==numFromPlayer5)
	{
		System.out.println("PLAYER 2 AND PLAYER 5 WON THE GAME");
		
	}
    else
	{
		System.out.println("PLAYER 2 WON THE GAME");
	}
	
}

else if(numFromGuesserobject==numFromPlayer3)
{
	if(numFromGuesserobject==numFromPlayer4  && numFromGuesserobject== numFromPlayer5 )
	 
	{
		System.out.println(" PLAYER 3 AND PLAYER 4 AND PLAYER 5 WON THE GAME");
	}
	else if(numFromGuesserobject==numFromPlayer4)
	{
		System.out.println("PLAYER 3 AND PLAYER 4 WON THE GAME");
		
	}
	else if(numFromGuesserobject==numFromPlayer5)
	{
		System.out.println("PLAYER 3 AND PLAYER 5 WON THE GAME");
		
	}
	else
	{
		System.out.println("PLAYER 3 WON THEGAME");	
	}
	
}
else if(numFromGuesserobject==numFromPlayer4)
{
	if(numFromGuesserobject==numFromPlayer5)
	{
		System.out.println("PLAYER 4 AND PLAYER 5 WON THE GAME");
	}
	else
	{
		System.out.println("PLAYER 4 WON THE GAME");
	}
}
else if(numFromGuesserobject==numFromPlayer5)
{
	System.out.println("PLAYER 5 WON THE GAME");
}	

else 
{
	System.out.println("SORRY,GAME LOST TRY AGAIN");
}
	  
	 
	}
}


public class Gametrying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Umpire2 u=new Umpire2();
		u.collectNumFromGuesserobject();
		u.collectNumFromPlayers();
		u.compare();
       
	}
	


	
	
	
}
