import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> delimitersList = new ArrayList<>();
        for (String token: tokens)
        {
            if (token.equals(openDel) || token.equals(closeDel))
            {
                delimitersList.add(token);
            }
        }
        return delimitersList;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int open = 0;
        int close = 0;
        boolean cont = true;
        while (cont)
        {
            if (delimiters.get(delimiters.size() - 1).equals(openDel))
            {
                delimiters.remove(delimiters.size() - 1);
            }
            else
            {
                cont = false;
            }
        }
        for (String delimiter: delimiters)
        {
            if (delimiter.equals(openDel))
            {
                open++;
            }
            else
            {
                close++;
            }
        }
        return open == close;
    }
}