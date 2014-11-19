import java.util.Scanner;

public class RandomDistribution
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("How many random numbers should be generated?");
        int times = s.nextInt();
        
        System.out.println("What is the number of values for each random draw?");
        int arraySize = s.nextInt();
        
        int[] rdmNums = [arraySize];
    }
}
