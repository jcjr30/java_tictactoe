import java.util.Scanner;

//Receive Input from CLI and use to establish
//x and y coordinates for placing X or O

public class Input {
    
    public Scanner sc = new Scanner(System.in);

    public int xCoord()   {
        int x = sc.nextInt();
        return x;
    }

    public int yCoord()   {       
        int y = sc.nextInt();
        return y;
    }


}


