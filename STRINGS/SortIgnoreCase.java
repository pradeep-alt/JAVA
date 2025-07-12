/*
 * i/p : "EGdcBAnM"
 * o/p : ABcdEGnM
 */

 public class SortIgnoreCase
 {
    public static String sortString(String s)
    {
        char [] ch = s.toCharArray();

        for(int i=0 ; i<ch.length ; i++)
        {
            for(int j=0 ; j<ch.length-1 ; j++)
            {
                if(toSmall(ch[j])>toSmall(ch[j+1]))
                {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        return new String(ch);
    }

    public static char toSmall(char c)
    {
        if(c>='A' && c<='Z')
            return c+=32;    
        return c;
    }

    public static void main(String[] args) {
        
        String s = "EGdcBAnM";
        System.out.println("\tInput : "+s+"\n\tOutput : "+sortString(s));
    }    
 }