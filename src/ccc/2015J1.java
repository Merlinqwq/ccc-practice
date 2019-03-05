//2015-J1
package ccc;

import java.util.*;
public class    Main {
    public static void main(String[] args) {
       final int specialmonth=2;
       final int specialday=18;
       int month=0;
       int day=0;
       Scanner input=new Scanner(System.in);
       month=input.nextInt();
       day=input.nextInt();
       if(month==specialmonth){
            if(day==specialday){System.out.println("Special");}
            else if(day>specialday){System.out.println("After");}
            else {System.out.println("Before");}
       }
       else if(month>specialmonth){System.out.println("After");}
       else {System.out.println("Before");}
       }
        
    }
    