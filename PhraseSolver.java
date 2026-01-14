/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    player1 = new Player();
    player2 = new Player();
    board = new Board();
    solved = false;
  }



  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      if (currentPlayer % 2 == 1) {//player1
        System.out.println(player1.getName[]+
        " it is your turn to guess.");
        else{
          System.out.println(player2.getName[]+
        " it is your turn to guess.");
        }
      }
      System.out.println(board.getSolvedPhrase());
      System.out.println(board.getCurrentLetterValue());
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}
