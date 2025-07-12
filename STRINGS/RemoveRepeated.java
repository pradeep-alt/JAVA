/*
 * i/p : "developer hello cat Abcd abac"
 * o/p : "devlopr helo cat Abcd abc"
 */
public class RemoveRepeated {

    public static String removeRepeatedLetters(String str)
    {
        char [] strarr = str.toCharArray();
        String ans="";
        for(int i=0 ; i<strarr.length ; i++)
        {
            if(strarr[i]==' ')
                continue;

            ans+=strarr[i];

            for(int j=i+1 ; j<strarr.length ; j++)
            {
                if(strarr[i]==strarr[j])
                {             
                    strarr[j]=' ';
                }
            }                     
        }
        return ans;        
    }
    public static void main(String[] args) {
        
        String s = "developer hello cat Abcd abac";
        String [] sa = s.split(" ");
        String res = "";
        for(int i=0 ; i<sa.length ; i++)
        {
           res+=removeRepeatedLetters(sa[i])+" ";
        }
        System.out.println("\tInput  : "+s+"\n\tOutput : "+res);
        
    }    
}
