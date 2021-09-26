import java.util.Scanner;

public class RoobikRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        RoobikCube rc = new RoobikCube(); // creates new RoobikCube

        // Code to ask user for instructions to manipulate the code
        // Commands would be left, right, up, down, cw, ccw and exit
        // Print out the cube after each command (except exit)
        String choice = "";
        while (!(choice.equals("exit")))
        {
            System.out.println(rc);
            System.out.println("Turn the Rubik's cube left, right, up or down. \nRotate the Rubik's cube face cw or ccw. \nEnter exit to exit: ");
            choice = input.nextLine();
            if (choice.equals("left"))
            {
                rc.left();
            }
            
            else if (choice.equals("right"))
            {
                rc.right();
            }
            
            else if (choice.equals("up"))
            {
                rc.up();
            }
            
            else if (choice.equals("down"))
            {
                rc.down();
            }
            
            else if (choice.equals("cw"))
            {
                rc.cw();
            }
            
            else if (choice.equals("ccw"))
            {
                rc.ccw();
            }
        }
    }
}
