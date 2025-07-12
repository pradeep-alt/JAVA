/*
 * i/p : "hi@how#you"
 * o/p : uo@ywo#hih
 */

public class ReverseOnlyAlphabets {

    public static String solve(String s)
    {
        char[] ca = s.toCharArray();
        int l=0;int r=ca.length-1;
        while(l<r)
        {
            if(!(ca[l]>='a' && ca[l]<='z'))
            {
                l++;
            }

            if(!(ca[r]>='a' && ca[r]<='z'))
            {
                r--;
            }
            
            char temp = ca[r];
            ca[r]=ca[l];
            ca[l]=temp;
            l++;r--;
            
        }
        
        return  new String(ca);
    }

    public static void main(String[] args) {
        
        String s = "hi@how#are@you";
        System.out.println("Input  : "+s+"\nOutput : "+solve(s));
    }

    
}
