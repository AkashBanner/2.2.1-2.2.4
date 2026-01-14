=/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) 
  prompt the user to input the player’s name;
  
  save the player's name to the instance variable;

  set their points to 0; and

  print a message welcoming the player, by name, to the game.*/ 
  public Player(){
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter Your Name");
  name = sc.nextLine();
  points = 0;
  System.out.print("Welcome "+ name);

  }

  public Player(String inputName){
  
  name = inputName;
  points = 0;
  System.out.print("Welcome "+ name);

  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}
