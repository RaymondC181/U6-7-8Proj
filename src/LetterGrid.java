public class LetterGrid {
    private Space[][] spaces;
    private int boardSize;

    public LetterGrid(int size)
    {

        // initialize the spaces 2D array
        Space[][] spaces = new Space[size][size];

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



    }

