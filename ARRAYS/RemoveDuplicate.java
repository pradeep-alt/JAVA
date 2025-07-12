
import java.util.*;
public class RemoveDuplicate {

    public static int[] removeDup(int[] a)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==Integer.MIN_VALUE)
                continue;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
        }
        int [] res = new int[a.length-count];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=Integer.MIN_VALUE)
                res[j++]=a[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {

        int [] arr={1,8,3,4,8,9,10,10,5,5};
        System.out.println(Arrays.toString(arr));
        int [] res = removeDup(arr);
        System.out.println(Arrays.toString(res));
        
    }
}
