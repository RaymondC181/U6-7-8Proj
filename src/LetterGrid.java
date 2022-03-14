public class LetterGrid {
    private Space[][] spaces;
    private int boardSize;
        static int MAX = 26;

    public LetterGrid(int size)
    {

        spaces = new Space[size][size];

        for (int row = 0; row < spaces.length; row++)
        {
            for (int col = 0; col < spaces[0].length; col++)
            {
                spaces[row][col] = new Space();
            }
        }
    }

    public String randAlp(int n)
    {
        char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z' };

        String res = "";
        for (int i = 0; i < n; i++)
            res = res + alphabet[(int) (Math.random() * 10 % MAX)];

        return res;
    }

    public void drawBoard()
    {

    }
}

