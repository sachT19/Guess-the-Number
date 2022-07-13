import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes objOne = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value:");
        int userMax = input.nextInt();
        Integer max = Integer.valueOf(userMax);
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by " +  objOne.maxDiff(max));
       
        
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("Guess the minimum Integer value:");
        int userMin = input.nextInt();
        Integer min = Integer.valueOf(userMin);
        
        
        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by " + objOne.minDiff(min));
        
        
       


        
        
    }
}
