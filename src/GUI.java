public class GUI {

    public static String coordOne = "_";
    public static String coordTwo = "_";
    public static String coordThree = "_";
    public static String coordFour = "_";
    public static String coordFive = "_";
    public static String coordSix = "_";
    public static String coordSeven = " ";
    public static String coordEight = " ";
    public static String coordNine = " ";


    /* 
        Method for displaying the game in CLI,
        checks for a win and changes UI accordingly
    */
    

    public static void gameOut()   {
            if (WinLogic.winTestX() == true) {
                System.out.println("Winner! X");
                System.out.println("X: " + WinLogic.xWinCount() + "   O: " + WinLogic.oWinCount());
                System.out.println("   1  2  3");
                System.out.println("1  _"+ coordOne + "|" + coordTwo + "|" + coordThree + "_");
                System.out.println("2  _" + coordFour + "|" + coordFive + "|" + coordSix + "_");
                System.out.println("3   " + coordSeven + "|" + coordEight + "|" + coordNine + " ");
                    if (Continue.doLoop() == 1)   {
                        reset();
                    }
                    
            }
            if (WinLogic.winTestO() == true) {
                System.out.println("Winner! O");
                System.out.println("X: " + WinLogic.xWinCount() + "   O: " + WinLogic.oWinCount());
                System.out.println("   1  2  3");
                System.out.println("1  _"+ coordOne + "|" + coordTwo + "|" + coordThree + "_");
                System.out.println("2  _" + coordFour + "|" + coordFive + "|" + coordSix + "_");
                System.out.println("3   " + coordSeven + "|" + coordEight + "|" + coordNine + " ");
                    if (Continue.doLoop() == 1)   {
                        reset();
                    }
            }
            else if (WinLogic.didWin() == false)    {
        System.out.println("Type x then y to play.");
        System.out.println("X: " + WinLogic.xWinCount() + "   O: " + WinLogic.oWinCount());
        System.out.println("   1  2  3");
        System.out.println("1  _"+ coordOne + "|" + coordTwo + "|" + coordThree + "_");
        System.out.println("2  _" + coordFour + "|" + coordFive + "|" + coordSix + "_");
        System.out.println("3   " + coordSeven + "|" + coordEight + "|" + coordNine + " ");
            }
    }

        /*
            Method for resetting the coordinate values following a win or tie
         */

    public static void reset()  {
            coordOne = "_";
            coordTwo = "_";
            coordThree = "_";
            coordFour = "_";
            coordFive = "_";
            coordSix = "_";
            coordSeven = " ";
            coordEight = " ";
            coordNine = " ";
    }

}
