
public class Board {
    // Original board
    public String getBoard() {
        return "\n 1 | 2 | 3 \n" +
                 "~~~~~~~~~~~\n" +
                 " 4 | 5 | 6 \n" +
                 "~~~~~~~~~~~\n" +
                 " 7 | 8 | 9 \n";
    }
    // Check board
    public boolean isFull(String board) {
        for(int i = 0; i < 9; i++) {
            for(int a = 0; a < board.length(); a++) {
                if(board.charAt(a) == Integer.toString(i).charAt(0)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Calculate win or lose
    public boolean winOrLose(String board, char a) {
        // Horizontal
        if(board.charAt(2) == a && board.charAt(6) == a && board.charAt(10) == a) {
            return true;
        }
        if(board.charAt(26) == a && board.charAt(30) == a && board.charAt(34) == a) {
            return true;
        }
        if(board.charAt(50) == a && board.charAt(54) == a && board.charAt(58) == a) {
            return true;
        }
        if(board.charAt(10) == a && board.charAt(30) == a && board.charAt(50) == a) {
            return true;
        }

        // Vertical
        if(board.charAt(2) == a && board.charAt(26) == a && board.charAt(50) == a) {
            return true;
        }
        if(board.charAt(6) == a && board.charAt(30) == a && board.charAt(54) == a) {
            return true;
        }
        if(board.charAt(10) == a && board.charAt(34) == a && board.charAt(58) == a) {
            return true;
        }
        if(board.charAt(2) == a && board.charAt(30) == a && board.charAt(58) == a) {
            return true;
        }
        // return false
        return false;
    }

}