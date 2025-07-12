public class FindUniqueElements {
    
    public static void uniqueElements(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int count = 0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i] == a[j])
                    count++;           
            }          
            if(count==1) 
                System.out.println(a[i]);   
        }   
    }
    public static void main(String[] args) {
        int [] a = {8,3,8,4,3,5,6,6};
        uniqueElements(a);
    }
    
}
