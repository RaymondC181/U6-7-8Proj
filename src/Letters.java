public class Letters
{
    public static final String[] playerSymbols = {"h", "o", "s", "r", "k", "a", "e", "n", "z", "t", "g"};

    // instance variable marked as FINAL
    // once it's set in the constructor, it stays!
    private final String symbol;

    public Letters (String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol()
    {
        return symbol;
    }
}