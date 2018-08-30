package ua.rozhkov;

public class Main {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        try {
            chessBoard.printBoard(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } catch (NumberFormatException e) {
            System.out.println("Wrong parameters!");
        }

    }

}
