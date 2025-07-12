public class TargetSum {

    public static void threeTargetSum(int [] a, int target)
    {
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                for(int k=j+1 ; k<a.length ; k++)
                {
                    if(a[i]+a[j]+a[k]==target)
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);   
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {1,0,3,4,7,5,2};
        int [] arr1 = {2,2,4,6,5,7,8};

        int target = 14;
        threeTargetSum(arr, target);
        threeTargetSum(arr1, target);
    }
    
}
