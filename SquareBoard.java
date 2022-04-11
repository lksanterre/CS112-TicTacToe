public class SquareBoard {
    int size;
    XOPiece[][] board;

    /**
      * Constructor that creates an n x n board of
      * XOPieces and each XOPiece is set to an initial Token
      */ 
    public SquareBoard(int n, XOPiece e) 
    {
        board = new XOPiece[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                setPiece(e,i,j);
            }
        }

    }

   /**
     * String representation of the board 
     * showing the contents of each space 
     */
    public String toString()
    {
        String returnStr = "";
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                returnStr += " [" +getPiece(i,j)+ "] ";
            }
        returnStr += "\n";
        }
        return returnStr;
    }

    /**
      * Method that prints out the board with
      * the coordinates of each slot
      * to show the users how to identify each slot
      */
    public void printBoardCoordinates()
    {
        for (int i=0; i<board.length; i++) 
        {
            for (int j=0; j<board[i].length; j++)
            {
                System.out.print("["+i+","+j+"] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
      * Sets a Token on the board with coordinates (i,j)
      */
    public boolean setPiece(XOPiece t, int i, int j)
    {
        board[i][j] = t;
        return true;
    }

    /**
      * Gets an item on the board with coordinates (i,j)
      */  
    public XOPiece getPiece(int i, int j)
    {
         return board[i][j];
    }

    public XOPiece checkWin(SquareBoard xboard){
            for(int j = 0; j<3; j++){
                if(board[0][j] == board[1][j] && board[1][j] == board[2][j] ){
                    return board[0][j];}}
            for(int i = 0; i<3; i++){
                if(board[i][0] == board[i][1] && board[i][1] == board[i][2] ){
                    return board[0][i];}}
            for(int k = 0; k<3; k++){
                if(board[0][0] == board[1][1] && board[1][1] == board[2][2] ){
                    return board[0][0];}}
            for(int w = 0; w<3; w++){
                if(board[0][2] == board[1][1] && board[1][1] == board[2][0] ){
                    return board[0][2];}}
            return null;
        }




}