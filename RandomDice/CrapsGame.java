// Name: Miguel
//
// Program File: CrapsGame.java
//
// Class Description: Implements the game of Craps logic.

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
   int result = 0;
   
   // First time rolling
   if (point == 0) {
     // If 7 or 11, win
     if (total == 7 || total == 11) {
       point = 0;
       result = 1;
     }
     // If 2, 3, 12 lose
     else if (total == 2 || total == 3 || total == 12) {
       point = 0;
       result = -1;
     }
     // If something else, set point to total for future rolls
     // NOTE: No need for result = 0 since it's already 0 (at top of method)
     else {
       point = total;
     }
   }
  // 2+ time rolling
  else {
    // If 7, lose
    if (total == 7) {
      point = 0;
      result = -1;
    }
    // If total is the same as the points, win
    else if (total == point) {
      point = 0;
      result = 1;
    }
  }
  return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

