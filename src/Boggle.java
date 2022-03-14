import java.util.Scanner;
public class Boggle {

    private LetterGrid board;
    public Boggle()
    {
        setup();
    }

    private void setup()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What size board? (3, 4, 5, or 6): ");
        int boardSize = scanner.nextInt();

        board = new LetterGrid(boardSize);

        // draws the board as part of setup
        board.drawBoard();
    }

}
