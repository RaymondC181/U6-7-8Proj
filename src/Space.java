public class Space
{
    public static final String BLANK = " ";
    private String symbol;


    public Space()
    {
        symbol = BLANK;

    }

    public String getSymbol()
    {
        return symbol;
    }

    public boolean occupySpace(String symbolOfOccupant)
    {
        if (symbol == BLANK)
        {
            symbol = symbolOfOccupant;
            return true;
        }
        return false;
    }



}