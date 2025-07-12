/* 
 * a = 8 2 4 2 3 8 
 * o/p
 *      8->2
 *      2->2
 *      4->1
 *      3->1 
 */  

import java.util.*;
class FrequencyCheck
{
    public static void frequencyOfElements(int [] a)
    {

        for(int i=0 ; i<a.length ; i++)
        {

        }
        for(int i=0 ; i<a.length ; i++)
        {
            int count = 0;
            for(int j=i ; j<a.length ; j++)
            {
                if(a[j]==a[i])
                {
                    count++;
                }
            }
            System.out.print(a[i]+"-->"+count);
            System.out.println();
        }
        System.out.println();

    }

    public static void main ( String [] args)
    {
        int [] a = {8,2,4,2,3,8};
        System.out.println(Arrays.toString(a));
        frequencyOfElements(a);
    }
}