public class WinLogic {

    //WinTestX() works by comparing a string against "X" then
    //comparing that string to its neighbors that could facilitate a win

    public static boolean winTestX()    {

        if (GUI.coordOne.equals("X"))  {

            if(GUI.coordTwo.equals("X"))    {
                if(GUI.coordThree.equals("X"))  {
                    return true;
                }
            }
            if (GUI.coordFour.equals("X"))    {
                if (GUI.coordSeven.equals("X"))   {
                    return true;
                }
            }
            if (GUI.coordFive.equals("X"))   {
                if  (GUI.coordNine.equals("X"))  {
                    return true;
                }
            }
        }
        if (GUI.coordFive.equals("X"))  {
            if (GUI.coordTwo.equals("X"))   {
                if (GUI.coordEight.equals("X"))   {
                    return true;
                }
            }
            else if (GUI.coordFour.equals("X"))  {
                if  (GUI.coordSix.equals("X"))  {
                    return true;
                }
            }
            if (GUI.coordThree.equals("X")) {
                if  (GUI.coordSeven.equals("X"))    {
                    return true;
                }
            }
        }
        if (GUI.coordNine.equals("X"))  {
            if(GUI.coordEight.equals("X"))  {
                if  (GUI.coordSeven.equals("X"))  {
                    return true;
                }
            }
            if (GUI.coordSix.equals("X"))  {
                if  (GUI.coordThree.equals("X"))  {
                    return true;
                }
            }
        }
        return false;
    }

    //WinTestO() works by comparing a string against "O" then
    //comparing that string to its neighbors that could facilitate a win

    public static boolean winTestO()    {

        if (GUI.coordOne.equals("O"))  {

            if(GUI.coordTwo.equals("O"))    {
                if(GUI.coordThree.equals("O"))  {
                    return true;
                }
            }
            if (GUI.coordFour.equals("O"))    {
                if (GUI.coordSeven.equals("O"))   {
                    return true;
                }
            }
            if (GUI.coordFive.equals("O"))   {
                if  (GUI.coordNine.equals("O"))  {
                    return true;
                }
            }
        }
        if (GUI.coordFive.equals("O"))  {
            if (GUI.coordTwo.equals("O"))   {
                if (GUI.coordEight.equals("O"))   {
                    return true;
                }
            }
            if (GUI.coordFour.equals("O"))  {
                if  (GUI.coordSix.equals("O"))  {
                    return true;
                }
            }
            if (GUI.coordThree.equals("O")) {
                if  (GUI.coordSeven.equals("O"))    {
                    return true;
                }
            }
        }
        if (GUI.coordNine.equals("O"))  {
            if(GUI.coordEight.equals("O"))  {
                if  (GUI.coordSeven.equals("O"))  {
                    return true;
                }
            }
            if (GUI.coordSix.equals("O"))  {
                if  (GUI.coordThree.equals("O"))  {
                    return true;
                }
            }
        }
        return false;
    }

    private static int countO = 0;
    private static int countX = 0;

        //Returns 'True' if any player has won
        //Returns 'False' otherwise

        public static boolean didWin()    {
            if (winTestO() == true)   {
                return true;
            }
            if (winTestX() == true)   {
                return true;
            }
            return false;
     }

     public static int xWinCount()   {
        
        if (winTestX() == true) {
            countX++;
        }
        return countX;
     }

     public static int oWinCount()   {
        
        if (winTestO() == true) {
            countO++;
        }
        return countO;
     }

     public static boolean didTie() {

        if (GUI.coordOne != "_")   {
            if(GUI.coordTwo != "_") {
                if(GUI.coordThree != "_")   {
                    if(GUI.coordFour != "_")   {
                        if(GUI.coordFive != "_")   {
                            if(GUI.coordSix != "_")   {
                                if(GUI.coordSeven != " ")   {
                                    if(GUI.coordEight != " ")   {
                                        if(GUI.coordNine != " ")   {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    
     }
    
}

