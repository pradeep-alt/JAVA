public class MissingNumbers {

    public static void printMissingNUmbers(int [] a)
    {
        for(int i=0 ; i< a.length-1 ; i++)
        {
            int s = a[i];
            int e = a[i+1];

            for(int j=s+1;j<e;j++)
            {
                System.out.println(j);
            }
        }
        

    }

    public static void main(String[] args) {
        
        int [] a = {1,2,5,7,10};
        printMissingNUmbers(a);
    }
    
}
