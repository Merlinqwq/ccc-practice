//2011-J2
package ccc;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int h=0;
        int M=0;
        h=input.nextInt();
        M=input.nextInt();
        
        int t=0;
        int A=1;
        while(t<=M&&A>0){
            t++;
            A=(-6)*t*t*t*t+h*t*t*t+2*t*t+t;
            if(A<=0){System.out.println("The balloon first touches ground at hour:");
                     System.out.println(t);}
            else if(t==M){System.out.println("The balloon does not touch ground in the given time.");}
           
            
        }
          
        
    }
