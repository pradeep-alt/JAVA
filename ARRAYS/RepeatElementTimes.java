public class RepeatElementTimes {

    public static void solve(int [] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0;j<a[i];j++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int [] arr = {10,2,4,5};
        solve(arr);
    }
    
}
