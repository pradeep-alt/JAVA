
/*
 * i/p : "apple Cat fox kiwi"
 * o/p : Apple cat Fox Kiwi
 * 
 */
public class FirstLetterChangeCase {

    public static String changeCase(String s) {
        
        char [] ca = s.toCharArray();
        
        if(ca[0]>='A' && ca[0]<='Z' )
            ca[0]+=32;
        else if(ca[0]>='a' && ca[0]<='z' )
            ca[0]-=32;

        return new String(ca);

    }

    public static void main(String[] args) {
        
        String s = "apple Cat fox kiwi";
        String res="";

        String[] sa = s.split(" ");
        for(int i=0 ; i<sa.length ; i++)
        {
            res+=changeCase(sa[i])+" ";
        }

        System.out.println("Input  : "+s+"\nOutput : "+res);
    }    
}
