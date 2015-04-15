import java.util.Scanner;//driver
public class TicTacToe {
  
  public static void main(String[] args){
    GameBoard myGame = new GameBoard();
  //  myGame.displayBoard();
    String playermove = "";
    Scanner scan = new Scanner(System.in);//scanner
    boolean keepPlaying = true;
    int turns = 0;
    System.out.println("Welcome to Masa's Tic Tac Toe game! You are Player X.");
    do{
       myGame.displayBoard();
//
       System.out.println("Choose the number that represents the option you want.");
       //scan.nextInt();
    //   playermove = scan.nextInt();
      
       
       if(myGame.gameInput(scan.nextLine())){
       turns++;
       }
       
       System.out.println("turns = " + turns);// erase me before you turn in!!!!!!
       
      myGame.computer();//Code for computer
       if (myGame.checkForWinner()){//methods called here
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