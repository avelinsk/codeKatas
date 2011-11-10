/**
 *
 *  1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
 *  2. Any live cell with more than three live neighbours dies, as if by overcrowding.
 *  3. Any live cell with two or three live neighbours lives on to the next generation.
 *  4. Any dead cell with exactly three live neighbours becomes a live cell.
 *
 * @author avelinsk
 */
public class GameOfLife {

  public int[][] play(int[][] cells){
    int[][] tmp = cells;
    System.out.println("Before:");
    print(cells);

    for (int i=0; i<cells.length; i++){
      for (int j=0; j<cells[i].length; j++){

        int count = 0;
        for (int x=i-1; x<=i+1; x++){
          for (int y=j-1; y<=j+1; y++){
            if(x>=0
                && y>=0
                && x<cells.length
                && y<cells[0].length
                && (x!=i || y!=j)
                && cells[x][y]==1)
            {
              count++;
            }
          }
        }

        if( count < 2 ){
          tmp[i][j] = 0;
        } else if (count > 3 && cells[i][j] == 1){
          tmp[i][j] = 0;
        } else if (count == 3 && cells[i][j] == 0 )
          tmp[i][j] = 1;
      }
    }
    System.out.println("After:");
    print(tmp);
    cells = tmp;
    return cells;
  }

  public void print(int[][] matrix){
    System.out.println("{");
    for (int[] ints : matrix) {
      for (int anInt : ints) {

        if (anInt == 1){
          System.out.print("#");
        } else {
          System.out.print(".");
        }

        //(anInt == 1) ? System.out.print("#") : System.out.print(".");

      }
      System.out.println("");
    }
    System.out.println("}");
  }
}
