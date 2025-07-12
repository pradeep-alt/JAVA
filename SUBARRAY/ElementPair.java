class ElementPair
{
    public static void elementPair(int [] a)
    {
        for(int i=0; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int []arr = {2,6,4,2,1};
        elementPair(arr);
    }
}