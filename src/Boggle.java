import java.util.Scanner;
public class Boggle {

    private LetterGrid board;
    public Boggle() {}

    public void setup()
    {
        board = new LetterGrid(4);

        // draws the board as part of setup
        board.drawBoard();
    }

}
