import java.util.Scanner;

public class Continue {
     

    //Returns a 1 or 2 based on player input, meant to be used to
    //continue or end the game
    public static int doLoop() {

        Input a = new Input();
        a.sc = new Scanner(System.in);
        
    if (WinLogic.didWin() == true)    {
        System.out.println("Type any letter to reset board, 'q' to quit");
            String loop = a.sc.nextLine();
            if (loop.equals("q"))   {
                System.out.println("Thanks for playing!");
                return 2;
            }          
    }
        return 1;
}
}
