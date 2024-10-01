Simple Command Line Interface Tic-Tac-Toe,  <br/>

  -May be ran in your Java compiler of choice, or via CMD with the .jar file  <br/>

  Rules/Features: <br/>
  
  -Player 'X' will always go first  <br/>
  
  -Coordinates must be input on seperate lines and x coordinates always go before y, for example  <br/>
    1 (enter)  <br/>
    2 (enter)  <br/>
  will result in a X/O being placed in the middle left position  <br/>

  -Coordinate Structure  <br/>
            (1,1) | (2,1) | (3,1)  <br/>
            (1,2) | (2,2) | (3,2)  <br/>
            (1,3) | (2,3) | (3,3)  <br/>

  -Tracks and displays player wins, prompts player to reset the board or quit ('q') after a win  <br/>
  -Checks for a tie (only returns true if board is full), then resets the board for another round  <br/>
  -Will not allow for an X/O to be overwritten, for example, if position (1,2) contains an 'X' <br/>
    then player 'O' tries to place an 'O' in that position, the game will prompt player 'O' to  <br/>
    try another location  <br/>

  -This is my first mostly complete coding project, I am aware of the following bugs: <br/>
    -Ignores/Skips a player's move if an integer besides 1,2,3 is input  <br/>
    -Crashes if anything but an integer is input when the game asks for coordinates  <br/>
    
