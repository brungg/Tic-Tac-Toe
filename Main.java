import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game g;
        int game;
        boolean isDone = false;
        
        // Main loop
        while(!isDone) {
        	g = new Game();
        	// Enter game
	        System.out.print("Enter 1 to play against a computer\n	Enter 2 to play multiplayer >> ");
	        game = input.nextInt();
	        
	        // choose game
	        if(game == 1) {
	        	g.getComp();
	        }
	        else if(game == 2) {
	        	g.getMulti();
	        } else {
	        	System.out.println("Enter vaild game number: 1 or 2");
	        }
	        
	        // check if done
	        isDone = g.getDone();
        }
        
        input.close();

    }
}