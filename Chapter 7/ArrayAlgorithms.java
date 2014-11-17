
public class ArrayAlgorithms
{
    private int [] values;
    
    public ArrayAlgorithms()
    {
        values = new int[10];
    }
    
    public String toString()
    {
        String str = "[";
        
        for( int val : values)
        {
           str += val + ",";
        }
        
        str += "]";
        return str;
    }
    
    public void fillWithSquares()
    {
        for(int i = 0; i <values.length; i++)
        {
            values[i] = i * i;
        }
    }
    
    public double getAverage()
    {
        double sum = 0;
        
        for(int val : values)
        {
            sum += val;
        }
        
        double average = sum / values.length;
        
        return average;
    }
    
    public int getIndexOfMaximum()
    {
        int max = values[0];
        int indexOfMax = 0;
        
        for(int i = 1; i < values.length; i++)
        {
            if(values[i] > max)
            {
                max = values[i];
                indexOfMax = i;
            }
        }
        
        return indexOfMax;
    }
}
