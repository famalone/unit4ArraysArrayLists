
public class ArrayMethods
{
    private int[] values;

    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
    }

    public String toString()
    {
        String str = "[";

        for(int i = 0; i < values.length; i++)
        {
            if(i > 0)
            {
                str += ", ";
            }
            str += values[i];
        }

        str += "]";
        return str;
    }

    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
    }

    public void shiftRight()
    {
        int temp = 0;
        values[0] = values[values.length - 1];
        for(int i = 1; i >= values.length; i++)
        {
            int temp2 = values[i];
            values[i] = temp;
        }
    }

    public void evenReplaceZero()
    {

    }

    public void replaceLrgNeighbor()
    {

    }

    public void removeMiddle()
    {

    }

    public void moveEven()
    {

    }

    //     public int getSecondLargest()
    //     {
    //         
    //     }
    //     
    //     public boolean isIncreasing()
    //     {
    //         
    //     }
    //     
    //     public boolean hasAdjacentDupes()
    //     {
    //         
    //     }
    //     
    //     public boolean hasDuplicates()
    //     {
    //         
    //     }
}