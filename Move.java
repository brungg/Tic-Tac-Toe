import java.util.*;
public class Move {
    public Random rand = new Random();

    // Calculate computers move
    public String getCompMove(String board) {
        boolean check = false;
        boolean isFound = false;
        while(!check) {
            int randNum = rand.nextInt(10);
            for (int i = 0; i < board.length(); i++) {
                if (board.charAt(i) == Integer.toString(randNum).charAt(0)) {
                    board = board.replace(board.charAt(i), 'o');
                    isFound = true;
                }

            }
            if(isFound) {
                check = true;
            }
        }
        return board;
    }

    // Calculate your move
    public String getMove(String board, int p, char c) {
        int a = board.indexOf(Integer.toString(p).charAt(0));
        board = board.replace(board.charAt(a), c);
        return board;
    }

}