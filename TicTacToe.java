import java.util.Scanner;
public class TicTacToe {
  
  public static void main(String[] args){
    GameBoard myGame = new GameBoard();
  //  myGame.displayBoard();
    int playermove;
    Scanner scan = new Scanner(System.in);
    boolean keepPlaying = true;
    int turns = 0;
    
    do{
       myGame.displayBoard();
//
       System.out.println("Choose the number that represents the option you want.");
       //scan.nextInt();
       //playermove = scan.nextInt();
       
       myGame.gameInput(scan.nextLine());//NEWCODE
       turns++;
       if (myGame.checkForWinner()){
         myGame.displayBoard();
         keepPlaying = false;
       }
       if(turns >= 9){
         System.out.println("It's a draw!");
         keepPlaying = false;
       }
       
    }while(keepPlaying == true);//change to true
  }
}