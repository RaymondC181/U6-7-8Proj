import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Boggle {

    private boolean gameStatus = true;
    private ArrayList correctWords = new ArrayList<>();


    public Boggle(){}

    public void runGame()
    {
        String[][] board = {
                {"g", "i", "z"},
                {"u", "e", "k"},
                {"q", "s", "e"}};

        LetterGrid grid = new LetterGrid(board);

        while (gameStatus)
        {
            grid.drawBoard();
            String str = enterValues();

            if(str.equals("geeks")||str.equals("for")||str.equals("quiz")||str.equals("go")||str.equals("geek"))
            {
                    if (correctWords.contains(str))
                    {
                        System.out.println("Founded Already");
                    }
                    else
                    {
                        correctWords.add(str);
                    }
            }
            System.out.println("Correct: " + correctWords);
            endgame();
        }
    }

    public String enterValues()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("-------------");
        System.out.println("Enter Word: ");
        String str = myScanner.nextLine();

        return str;
    }

    public void endgame()
    {
        int num = 0;
        for(int i = 0; i<=correctWords.size(); i++)
        {
            if(i==5)
            {
                gameStatus = false;
                System.out.println("You found all words!");
            }
        }
    }

}
