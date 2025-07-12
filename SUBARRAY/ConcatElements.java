class ConcatElements
{
    public static void elementPair(int [] a)
    {
        for(int i=0; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                for(int k=i; k<=j ; k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.print(" , ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int []arr = {2,-1,4,-3,3};
        elementPair(arr);
    }
}