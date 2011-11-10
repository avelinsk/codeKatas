import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * @author avelinsk
 */
public class GameOfLifeTest {
  GameOfLife gol;
  int[][] oldGenerationCells;
  int[][] newGenerationCells;

  @Before
  public void setUp(){
    gol = new GameOfLife();
  }

  @Test
  public void testTwoLiveNeighbours(){
    oldGenerationCells = new int[][]{
            {0, 1, 0},
            {0, 1, 0},
            {0, 0, 0}
    };

    newGenerationCells = new int[][]{
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };

    assertEquals(true, compare(newGenerationCells, gol.play(oldGenerationCells)));
  }

  @Test
  public void testThreeLiveNeighbours(){
    oldGenerationCells = new int[][]{
            {0, 1, 0},
            {0, 1, 1},
            {0, 1, 1}
    };

    newGenerationCells = new int[][]{
            {0, 1, 0},
            {1, 1, 0},
            {0, 1, 1}
    };

    assertEquals(true, compare(newGenerationCells, gol.play(oldGenerationCells)));
  }

  @After
  public void tearDown(){
    gol = null;
  }

  boolean compare(int[][]m1, int[][]m2){
    if((m1.length != m2.length) || (m1[0].length != m2[0].length)){
      return false;
    }
    for (int i=0; i<m1.length; i++) {
      if(!Arrays.equals(m1[i],m2[i])){
        return false;
      }
    }
    return true;
  }
}
