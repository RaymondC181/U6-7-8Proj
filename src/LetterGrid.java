public class LetterGrid {
    private Space[][] spaces;
    private int boardSize;

    public LetterGrid(int size) {

        spaces = new Space[size][size];

        for (int row = 0; row < spaces.length; row++)
        {
            for (int col = 0; col < spaces[0].length; col++)
            {
                spaces[row][col] = new Space();
            }
        }
    }

    public static void drawBoard()
    {
        int rows = 4;
        int columns = 4;
        char[][] table = new char [rows][columns];
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                int number = (int) (Math.random() * 26) + 65;  //just move this line
                table[r][c] = (char) number;
                System.out.print(table[r][c] + " ");
            }//inner for loop
            System.out.println();
        }//outer for loop
    }

}



