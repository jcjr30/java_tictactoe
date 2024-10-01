public class Position {


            //Coordinate Structure
            //(1,1) | (2,1) | (3,1)
            //(1,2) | (2,2) | (3,2)
            //(1,3) | (2,3) | (3,3) 


        //Generates an "X" in the provided coords

    public static void xSpot(int xPos, int yPos) {
        
        if(xPos == 1)    {
            if(yPos == 1)   {
                if(GUI.coordOne.equals("X") || GUI.coordOne.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordOne = "X";
                GUI.gameOut();
                }
            }

            else if(yPos == 2)   {
                if(GUI.coordFour.equals("X") || GUI.coordFour.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordFour = "X";
                GUI.gameOut();
                }
            }

            else if(yPos == 3)   {
                if(GUI.coordSeven.equals("X") || GUI.coordSeven.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordSeven = "X";
                GUI.gameOut();
                }
            }
        }
        

        else if (xPos == 2)  {
            if(yPos == 1)   {
                if(GUI.coordTwo.equals("X") || GUI.coordTwo.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordTwo = "X";
                GUI.gameOut();
                }
            }

            else if(yPos == 2)   {
                if(GUI.coordFive.equals("X") || GUI.coordFive.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordFive = "X";
                GUI.gameOut();
                }
            }

            else if(yPos == 3)   {
                if(GUI.coordEight.equals("X") || GUI.coordEight.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordEight = "X";
                GUI.gameOut();
                }
            }
        }

        else if (xPos == 3)  {
            if(yPos == 1)   {
                if(GUI.coordThree.equals("X") || GUI.coordThree.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordThree = "X";
                GUI.gameOut();
                }
            }

            else if(yPos == 2)   {
                if(GUI.coordSix.equals("X") || GUI.coordSix.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordSix = "X";
                GUI.gameOut();
                }
            }

            else if(yPos == 3)   {
                if(GUI.coordNine.equals("X") || GUI.coordNine.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input X = new Input();
                    xSpot(X.xCoord(), X.yCoord());
                }
                else    {
                GUI.coordNine = "X";
                GUI.gameOut();
                }
            }
        }
    }


        //Generates an "O" in the provided coords

    public static void oSpot(int xPos, int yPos) {
        
        if(xPos == 1)    {
            if(yPos == 1)   {
                if(GUI.coordOne.equals("X") || GUI.coordOne.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {   
                GUI.coordOne = "O";
                GUI.gameOut();
                }
            }

            else if(yPos == 2)   {
                if(GUI.coordFour.equals("X") || GUI.coordFour.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordFour = "O";
                GUI.gameOut();
                }
            }

            else if(yPos == 3)   {
                if(GUI.coordSeven.equals("X") || GUI.coordSeven.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordSeven = "O";
                GUI.gameOut();
                }
            }
        }
        

        else if (xPos == 2)  {
            if(yPos == 1)   {
                if(GUI.coordTwo.equals("X") || GUI.coordTwo.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordTwo = "O";
                GUI.gameOut();
                }
            }

            else if(yPos == 2)   {
                if(GUI.coordFive.equals("X") || GUI.coordFive.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordFive = "O";
                GUI.gameOut();
                }
            }

            else if(yPos == 3)   {
                if(GUI.coordEight.equals("X") || GUI.coordEight.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordEight = "O";
                GUI.gameOut();
                }
            }
        }

        else if (xPos == 3)  {
            if(yPos == 1)   {
                if(GUI.coordThree.equals("X") || GUI.coordThree.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordThree = "O";
                GUI.gameOut();
                }
            }

            else if(yPos == 2)   {
                if(GUI.coordSix.equals("X") || GUI.coordSix.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordSix = "O";
                GUI.gameOut();
                }
            }

            else if(yPos == 3)   {
                if(GUI.coordNine.equals("X") || GUI.coordNine.equals("O"))    {
                    System.out.println("Already contains a value, try a different location");
                    Input O = new Input();
                    oSpot(O.xCoord(), O.yCoord());
                }
                else    {
                GUI.coordNine = "O";
                GUI.gameOut();
                }
            }
        }
    }

}
