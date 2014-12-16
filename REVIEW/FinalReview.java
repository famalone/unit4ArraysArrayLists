import java.util.ArrayList;
public class FinalReview
{
    public FinalReview()
    {
        
    }

    public static void main(String[] args)
    {
        
        //
        // Enhanced for loops
        //
        int[] int array = {3,5,7,9};
        for(int value : intArray)
        {
            System.out.println(value);
            
            //doesn't change the values stored in inArray
            value += 3;
        }
        
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Happy");
        stringlist.add("Finals");
        
        for(String str : stringList)
        {
            System.out.println(str);
        }
        
        //
        // Promotion
        //
        
        int x = 7;
        double y = 5.5;
        
        //this is an example of automatic type promotion
        // (sutomatic casting to a more precice type)
        y = y + x; //
    }
}
