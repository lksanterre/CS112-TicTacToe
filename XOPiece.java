public class XOPiece
{
    /** enumerated type that dictates the two values of 
      * tic tac toe
      */
    public static enum XO {X, O}

    private XO type;

    /** Constructor to hold an empty piece 
      * that is neither X or O. An empty 
      * piece should just display 3 spaces
      */
    public XOPiece() 
    {
        type = null;
    }

    /** Constructor that creates a piece for 
      * the TicTacToe board -- either an X or O
      * See sample output.
      */
    public XOPiece(XO choice)
    {
        type = choice;
        
    }

    public boolean isEmpty()
    {
        if(type == null)
            return true;
        return false;
    }

    public String toString()
    {
        String returnString = null;
        if (type == null){
            returnString = "---";
        }
        else if (type == XO.X){
            returnString = "-X-";
        }
        else{
            returnString = "-O-";
        }
        return returnString;
    }

    /** Method that checks if one XOPiece has the same XO value.
      * If the calling object has the same internal XO value as the
      * object sent as a formal parameter.
      */
    public boolean match (XOPiece piece)
    {
        if(type == piece.type){
            return true;
        }
        return false; 
    }
}