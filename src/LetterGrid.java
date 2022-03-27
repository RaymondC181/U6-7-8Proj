import java.util.ArrayList;
public class LetterGrid
{

    private String[][] strArr;

     public LetterGrid(String[][] board) {
         strArr = board;
     }

      public void drawBoard()
      {
          for(int row = 0; row< strArr.length; row++) {
              for (int col = 0; col < strArr[0].length; col++)
              {
                  System.out.print(strArr[row][col] + "|");
              }
              System.out.println();
          }
      }


}
