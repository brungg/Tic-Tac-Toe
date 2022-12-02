import java.util.*;

public class Game {
	private Scanner input;
	private Move m;
	private Board board;
	private String newBoard;
	private int position;
    
	public void getComp() {
		// init var
        input = new Scanner(System.in);
        m = new Move();
        board = new Board();
        newBoard = board.getBoard();
        
        System.out.println(board.getBoard());
        while(true) {
            // Your move
            System.out.print("Enter position >> ");
            position = input.nextInt();
            newBoard = m.getMove(newBoard, position, 'x');

            // Check board
            if(board.isFull(newBoard)) {
                System.out.println(newBoard);
                break;
            }

            // Computer move
            newBoard = m.getCompMove(newBoard);

            // Output
            System.out.println(newBoard);

            // Check win or lose
            if(board.winOrLose(newBoard, 'x')) {
                System.out.println("You Win!");
                break;
            }
            if(board.winOrLose(newBoard, 'o')) {
                System.out.println("You Lose");
                break;
            }
        }
	}
	public void getMulti() {
		// init var
        input = new Scanner(System.in);
        m = new Move();
        board = new Board();
        newBoard = board.getBoard();
        
        System.out.println(board.getBoard());
        while(true) {
            // 1 player move
            System.out.print("Player 1: Enter position >> ");
            position = input.nextInt();
            newBoard = m.getMove(newBoard, position, 'x');
            
            // Output
            System.out.println(newBoard);
            
            // Check board
            if(board.isFull(newBoard)) {
                System.out.println(newBoard);
                break;
            }
            // Check win or lose
            if(board.winOrLose(newBoard, 'x')) {
                System.out.println("'X' Wins!");
                break;
            }

            // 2 player move
            System.out.print("Player 2: Enter position >> ");
            position = input.nextInt();
            newBoard = m.getMove(newBoard, position, 'o');

            // Output
            System.out.println(newBoard);

            // Check win or lose
            if(board.winOrLose(newBoard, 'o')) {
                System.out.println("'O' Wins!");
                break;
            }
        }
	}
	public boolean getDone() {
		input = new Scanner(System.in);
		
		System.out.print("Enter yes to keep playing or no to quit >> ");
		String a = input.nextLine();
		
		// return
		if(a.equals("yes"))
			return false;
		return true;
	}
}