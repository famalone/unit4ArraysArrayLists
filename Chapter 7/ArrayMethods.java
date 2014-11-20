
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
        int temp = values[0];
        values[0] = values[values.length - 1];
        for(int i = 1; i <= values.length - 1; i++)
        {
            int temp2 = values[i];
            values[i] = temp;
            temp =  temp2;
        }
    }

    public void evenReplaceZero()
    {
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
    }

    public void replaceLrgNeighbor()
    {
        for(int i = 0; i < values.length; i++)
        {
            if((i != 0) && ( i != values.length - 1))
            {
                int neighbor1 = values[i - 1];
                int neighbor2 = values[i + 1];
                if(neighbor1 == neighbor2 || neighbor1 > neighbor2)
                {
                    values[i] = neighbor1;
                }
                else
                {
                    values[i] = neighbor2;
                }
            }
        }
    }

    public void removeMiddle()
    {
        int newArraySize = 0;
        if(values.length % 2 == 0)
        {
            newArraySize = values.length - 2;
        }
        else
        {
            newArraySize = values.length - 1;
        }
        int[] newArray = new int[newArraySize];
        
        for(int i = 0; i < newArraySize; i++)
        {
            if(newArraySize == values.length - 2)
            {
                int middle = (values.length / 2) - 1;
                int middle2 = values.length / 2;
                if((i != middle) && (i != middle2))
                {
                    newArray[i] = values[i];
                }
            }
            else
            {
                int middle = values.length / 2;
                if(i != middle)
                {
                    newArray[i] = values[i];
                }
            }
        }
        values = newArray;
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