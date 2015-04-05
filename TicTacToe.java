import java.util.Scanner;
public class TicTacToe {
  
  public static void main(String[] args){
    GameBoard myGame = new GameBoard();
  //  myGame.displayBoard();
    int playermove;
    Scanner scan = new Scanner(System.in);
    boolean keepPlaying = true;
    
    do{
       myGame.displayBoard();
//
       System.out.println("Choose the number that represents the option you want.");
       scan.nextInt();
       playermove = scan.nextInt();
       if(playermove == 1){
         grid[0][0] = 'X';
       }
       if(playermove == 2){
         grid[0][2] = 'X';
       }
       if(playermove == 3){
         grid[0][4] = 'X';
       }
       
        playermove = scan.nextInt();
      
      
    }while(keepPlaying == false);//change to true
  }
}