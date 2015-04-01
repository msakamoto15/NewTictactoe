public class GameBoard{
  
  
  public int empty = 0;//possible characters
  public int xs = 1;
  public int os = 2;
  public int numRows = 3;
  public int numCols = 3;

  public GameBoard(){
 int[][] grid = new int[numRows][numCols];  
    
  } 

  
public void displayBoard(){ //creates the board 
  for(int row = 0; row < numRows; row++){
    for(int col = 0; col < numCols; col++){
     grid[row][col] = empty;
    }
  }
}
}
