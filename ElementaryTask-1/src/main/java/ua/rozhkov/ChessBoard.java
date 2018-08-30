
package ua.rozhkov;

/**
 * Class represent chessboard and do print of chessboard layout
 *
 * @author Rozhkov AG
 * @version 1.0
 */
class ChessBoard {

    /**
     * Method printBoard print chessboard from input parameters
     *
     * @param width
     * @param height
     */
    void printBoard(int width, int height) {

        if (width <= 0 || height <= 0) {
            System.out.println("Wrong parameters! Must be more than 0");
            return;
        }
        boolean shift = true;
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if (shift) {
                    System.out.print("*");
                    shift = false;
                } else {
                    System.out.print(" ");
                    shift = true;
                }
            }
            System.out.println();
            shift = !shift;
        }
    }
}

