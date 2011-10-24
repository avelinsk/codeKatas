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

    for (int i=0; i<cells.length; i++){
      for (int j=0; j<cells[0].length; j++){
        if((cells[i][j] == 1) && cells)
      }
    }

    return cells;
  }
}
