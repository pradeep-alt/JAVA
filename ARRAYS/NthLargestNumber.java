
import java.util.*;

class NthLargestNumber
{
    public static int nthLargest(int [] a, int n)
    {
        Arrays.sort(a);
        int [] res = RemoveDuplicate.removeDup(a);  
        System.out.println(Arrays.toString(res));      
        return res[res.length-n];
    }

    public static void main(String[] args)
    {
        int [] arr={11,2,6,55,55,9,9,60,60,60};
        int n = 5;
        int res = nthLargest(arr, n);
        System.out.println("The "+n+"  largest element = "+res);

    }

}