import java.util.Scanner;
public class TicTacToe {
  
  public static void main(String[] args){
    GameBoard myGame = new GameBoard();
  //  myGame.displayBoard();
    Scanner scan = new Scanner(System.in);
    boolean keepPlaying = true;
    
    do{
       myGame.displayBoard();
//
       System.out.println("Choose the number that represents the option you want.");
       scan.nextInt();
      
      
    }while(keepPlaying == false);//change to true
  }
}