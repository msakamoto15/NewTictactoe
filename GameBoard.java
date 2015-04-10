import java.util.ArrayList;

public class GameBoard{
  
  

  public int numRows = 5;
  public int numCols = 5;
  String[][] grid = new String[numRows][numCols]; 
  int[][] cells = new int[numRows][numCols]; 
  
  public GameBoard(){
    grid[0][0] =  "1";
    grid[0][2] =  "2";
    grid[0][4] =  "3";
    grid[2][0] =  "4";
    grid[2][2] =  "5";
    grid[2][4] =  "6";
    grid[4][0] =  "7";
    grid[4][2] =  "8";
    grid[4][4] =  "9";
  } 
  
  public void computer1(){
    
  for(int row = 0; row < grid.length; row = row + 2){
      for(int col = 0; col < grid.length; col= col+2){
        if(!(grid[row][col].equalsIgnoreCase("X") || grid[row][col].equalsIgnoreCase("O")) || isValidSpot(grid[row][col])){
          grid[row][col] = "O";
          return;
        }
      }
  }
}
 public boolean computer(){//Computer moves
   int count = 0;
   int i = 0;
   for(i=0;i<5;i++){
      for(int o=0;o<5;o++){
        if(grid[i][o].equalsIgnoreCase("X")){
          count++;
        }
        
      }
   }
   
   if(count < 2)
   {
     computer1();//not the smart computer
    
   }
   else
   {
    for( i=0;i<5;i=i+2){
      if(grid[i][0].equals(grid[i][2]) || grid[i][0].equals(grid[i][4]) || grid[i][2].equals(grid[i][4])){
        if(!(grid[i][0].equals("X")))
        {
          grid[i][0] = "O";
        }
        else if(!(grid[i][2].equals("X")))
        {
          grid[i][2] = "O";
        }
        else if(!(grid[i][4].equals("X")))
        {
          grid[i][4] = "O";
        }
        else{
          computer1();
        }
        return true;
      }
    }
    for(i=0;i<5;i=i+2){
      if(grid[0][i].equals(grid[2][i]) || grid[0][i].equals(grid[4][i]) || grid[2][i].equals(grid[4][i])){
        if(!(grid[0][i].equals("X"))) 
        {
          grid[0][i] = "O";
        }
        else if(!(grid[2][i].equals("X")))
        {
          grid[2][i] = "O";
        }
        else if(!(grid[4][i].equals("X"))) 
        {
          grid[4][i] = "O";
        }
        else
        {
          computer1();
        }
        return true;
      }
    }
      if(grid[0][0].equals(grid[2][2]) || grid[0][0].equals(grid[4][4]) || (grid[2][2].equals(grid[4][4]))){//diagonal1
       if(!(grid[i][0].equals("X")))
        {
          grid[0][0] = "O";
        }
        else if(!(grid[2][2].equals("X")))
        {
          grid[2][2] = "O";
        }
        else if(!(grid[4][4].equals("X")))
        {
          grid[4][4] = "O";
        }
        else{
          computer1();
        }
        return true;
      }
      if(grid[0][4].equals(grid[2][2]) || grid[0][4].equals(grid[4][0]) || grid[2][2].equals(grid[4][0])){//diagonal2
    if(!(grid[i][0].equals("X")))
        {
          grid[0][4] = "O";
        }
        else if(!(grid[2][2].equals("X")))
        {
          grid[2][2] = "O";
        }
        else if(!(grid[4][0].equals("X")))
        {
          grid[4][0] = "O";
        }
        else{
          computer1();
        }
        return true;
    }
   }
  return false;
  }
  
  public boolean checkForWinner(){
    for(int i=0;i<5;i=i+2){
      if(grid[i][0].equals(grid[i][2]) && grid[i][0].equals(grid[i][4])){
        System.out.println  ("player " + grid[i][0] + "wins");
        return true;
      }
    }
    for(int i=0;i<5;i=i+2){
      if(grid[0][i].equals(grid[2][i]) && grid[0][i].equals(grid[4][i])){
        System.out.println  ("player " + grid[0][i] + "wins");
        return true;
      }
    }
      if(grid[0][0].equals(grid[2][2]) && grid[0][0].equals(grid[4][4])){//diagonal1
        System.out.println  ("player " + grid[0][0] + "wins");
        return true;
      }
      if(grid[0][4].equals(grid[2][2]) && grid[0][4].equals(grid[4][0])){//diagonal2
        System.out.println  ("player " + grid[0][4] + "wins");
        return true;
      }
    
  return false;
  }
  
  public boolean gameInput(String input){
    boolean result = false;
    for(int i=0;i<5;i++){
      for(int o=0;o<5;o++){
        if(grid[i][o].equals(input) && isValidSpot(input)){
          
          grid[i][o]="X";
          
         result = true;
        }

      }
    }
    return result;
  }

  
  public boolean isValidSpot(String input){
    boolean result = true;
    for(int row = 0; row < grid.length; row++){
     for(int col = 0; col < grid.length; col++){
       if(grid[row][col].equals(input)){
        if(grid[row][col].equalsIgnoreCase("X") || grid[row][col].equalsIgnoreCase("O")){
           result = false;
        }
       }
     }
    }
    
    return result;
  }
  
public void displayBoard(){ //creates the board 

  
  for(int row = 0; row < grid.length; row++){
      for(int col = 0; col < grid.length; col++){
        
        if(row == 0 || row == 2 || row == 4){
          if(col == 1 || col == 3){
            grid[row][col] = "|"; 
          
          } 
        }
        else{
           grid[row][col] = "-";
        }
        System.out.print(grid[row][col]);
    }
      System.out.println();
  }

}

}
