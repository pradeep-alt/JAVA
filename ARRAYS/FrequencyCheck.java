public class FrequencyCheck {

    public static void findFrequency(int[] a)
    {
        
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]==Integer.MIN_VALUE)
                    continue;
            int count=1;
            for(int j=i+1 ; j<a.length ; j++)
            {               
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
            System.out.print(a[i]+"-"+count);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        
        int [] arr = {3,4,3,1,4,2};
        findFrequency(arr);
    }
    
}
