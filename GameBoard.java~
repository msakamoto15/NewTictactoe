import java.util.ArrayList;

public class GameBoard{
  
  

  public int numRows = 5;
  public int numCols = 5;
  char[][] grid = new char[numRows][numCols]; 
  int[][] cells = new int[numRows][numCols]; 
  
  public GameBoard(){
    
  } 

  
public void displayBoard(){ //creates the board 
  grid[0][0] =  '1';
  grid[0][2] =  '2';
  grid[0][4] =  '3';
  grid[2][0] =  '4';
  grid[2][2] =  '5';
  grid[2][4] =  '6';
  grid[4][0] =  '7';
  grid[4][2] =  '8';
  grid[4][4] =  '9';
  
  for(int row = 0; row < grid.length; row++){
      for(int col = 0; col < grid.length; col++){
        
        if(row == 0 || row == 2 || row == 4){
          if(col == 1 || col == 3){
            grid[row][col] = '|'; 
          
          } 
        }
        else{
           grid[row][col] = '-';
        }
        System.out.print(grid[row][col]);
    }
      System.out.println();
  }
}
//public void displayOptions(){
//  
//  
//  for(int i = 0; i < arr.length; i++){
//    System.out.println((i + 1) + " = " + arr[i]);
//  }
//}
//public void markChoice(int x){
//  arr[x] = " ";
//}
}
