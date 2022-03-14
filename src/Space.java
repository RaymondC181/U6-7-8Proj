public class Space
{
//    public static final String BLANK = " ";
    static int MAX = 26;
    private String symbol;

    public Space()
    {
        symbol = randAlp(10);
    }

    public String getSymbol()
    {
        return symbol;
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



}