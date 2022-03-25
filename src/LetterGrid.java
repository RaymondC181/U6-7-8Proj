
public class LetterGrid
{
    // spaces on the Board (2D array of Space objects)
    private Space[][] spaces;

    // size of Board (either 3, 4, 5, or 6)
    private int boardSize;

    /**
     * Constructs Space objects and adds them to the spaces array.
     * Also sets up the winning conditions for tic-tac-toe.
     */
    public LetterGrid(int size)
    {
        boardSize = size;

        // initialize the spaces 2D array
        spaces = new Space[size][size];

        // set each space in the spaces 2d array to a new Space object
        // which has a "blank" as the default symbol
        for (int row = 0; row < spaces.length; row++)
        {
            for (int col = 0; col < spaces[0].length; col++)
            {
                spaces[row][col] = new Space();
            }
        }
    }

    // getter method which allows the client to specify
    // which specific Space to return
    public Space getSpace(int row, int col)
    {
        // check to make sure the requested Space is in bounds!
        if (row >= 0 && row < spaces.length && col >= 0 && col < spaces[0].length)
        {
            return spaces[row][col];
        }
        return null;
    }

    public void drawBoard()
    {
        System.out.println();

        int spaceNum = 0;

        // draw the grid row by row, column by column
        for (int row = 0; row < spaces.length; row++)
        {
            for (int col = 0; col < spaces[0].length; col++)
            {
                spaceNum++;

                Space space = spaces[row][col];

                // number all blank spaces 1 thru 9, 16, 25, or 36
                if (space.getSymbol() == Space.BLANK)
                {
                    // add a SPACE in front of single-digit numbers
                    if (spaceNum <= 9)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(spaceNum);
                }
                else
                {
                    System.out.print(" " + space.getSymbol());
                }

                // print a vertical divider between each column
                System.out.print("|");
            }

            // print a horizontal divider after each row
            System.out.println();

            int numDashes = 3 * boardSize; //determined based on visually seeing what looked best
            for (int j = 0; j < numDashes; j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }

        System.out.println();
    }

    /**
     *Determines whether or not the board is full (has no BLANK spaces).
     *
     *@return True if there are no BLANKs in any spaces.
     */
    public boolean isFull()
    {
        for (Space[] row : spaces)
        {
            for (Space space : row)
            {
                if (space.getSymbol() == Space.BLANK)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
