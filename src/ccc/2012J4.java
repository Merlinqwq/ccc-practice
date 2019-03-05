//2012-J4
package ccc;
import java.util.*;


public class Main {
    public static void main(String[] args) {            
        Scanner input=new Scanner(System.in);
        int K=4;
        String code;
        K=input.nextInt();
        code=input.nextLine();
        code=input.nextLine();
        for(int i=0;i<code.length();i++){
           char letter = code.charAt(i);
           char message=(char) (letter+K);
           if(message>90){message=(char) (letter+K-26);}
           System.out.print(message);}
    }
    
}

