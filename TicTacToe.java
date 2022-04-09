import java.util.*;
public class TicTacToe 
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to this game of TicTacToe");
        System.out.println("You and another player will play");
        System.out.println("X will play First and then O will follow");
        System.out.println("Player ONE enter your name");

        Scanner p1 = new Scanner(System.in);
        String name1 = p1.nextLine();
        System.out.println("Player TWO enter your name");
        Scanner p2 = new Scanner(System.in);
        String name2 = p2.nextLine();
        Random r = new Random();
        int number = r.nextInt(1);
        

        XOPiece.XO[] arr = XOPiece.XO.values();
        XOPiece player1piece = new XOPiece(arr[0]);
        XOPiece player2piece = new XOPiece(arr[1]);
        Player player1;
        Player player2;
        if (number%2 == 0){
            player1 = new Player(name1, player1piece);
            player2 = new Player(name2 , player2piece);
        }
        else{
            player1 = new Player(name1 , player2piece);
            player2 = new Player(name2 , player1piece);
        }
        System.out.println("Player 1: " + name1 + " Piece: " + player1.getPiece().toString());
        
        System.out.println("Player 2: " + name2 + " Piece: " + player2.getPiece().toString());
        
        SquareBoard board = new SquareBoard(3, new XOPiece());
        board.printBoardCoordinates();
        System.out.println(board);
        

        
    }

}