/*
 * i/p : "s24ye38d"
 * o/p : s42ye83d
 * 
 * String s = str.subString(0,7); ----> tip: use this to extract range of string
 */

public class ReverseOnlyNumbers {

    public static void reverseDigitsOnly(String str) {
        int len = str.length();
        // System.out.println(str(1));

        for(int i=0 ; i<len ; i++)
        {
            String num ="";
            int s = i , e = s+1;

            while (Character.isDigit(str.charAt(i)) && !(Character.isDigit(str.charAt(i+1))))
            {
                num+=str.charAt(i);
                System.out.println(num);
                break;
            }
            
            for(int j=i+1 ; j<len ; j++)
            {
                if (Character.isDigit(str.charAt(j)))
                {
                    num+=str.charAt(j);                  
                }

            }
            // System.out.println(num);
        }
     
        

        // return new String(chars);
    }


    public static void main(String[] args) {
        
        String s ="s24ye38d";
        // System.out.println("Input  : "+s+"\nOutput : "+reverseDigitsOnly(s));
        reverseDigitsOnly(s);
    }       
}

