public class ArrayProductItself
{
    public static int[] productOfArrayItself(int [] a)
    {
        for (int i=0; i<a.length ; i++)
        {
            System.out.print(a[i] + "  ");
        
        }
        System.out.println();
        int []res = new int [a.length];
        for (int i=0; i<a.length ; i++)
        {
            int product =1;
            for(int j=0; j<a.length ; j++)
            {
                if(j!=i)
                {
                    product*=a[j];
                }
            }
            System.out.print(product + " ");
        }
        return res;
        
    }



    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        productOfArrayItself(array);
               
    }
}