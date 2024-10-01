public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Tic-Tac-Toe!");

        //Outputs the board to CLI
        GUI.gameOut();

        //Determines wether or not the game should continue after a win,
        //if the input is anything but 'q' is input a '1' will be returned
        //and the game will reset and continue
        Continue.doLoop();

        for (Continue.doLoop(); Continue.doLoop() != 2;) {
           
        //if a player has not won, and the board is full it
        //will reset
        if (WinLogic.didWin() == false)  {
            if (WinLogic.didTie() == true)   {
                System.out.println("Tie, resetting");
                GUI.reset();
                GUI.gameOut();
            }
            

        //Creates a new input for each player
        Input X = new Input();
        Input O = new Input();

        //Takes x, y input from CLI and interprets it as coordinates
        Position.xSpot(X.xCoord(), X.yCoord());
        Position.oSpot(O.xCoord(), O.yCoord());

        }

        else if (WinLogic.didWin() == true)  {
            GUI.reset();
        }

    }

    }

}
