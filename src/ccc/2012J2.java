//2012-J2
package ccc;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int depth1=0;
        int depth2=0;
        int depth3=0;
        int depth4=0;
        Scanner input=new Scanner(System.in);
        depth1=input.nextInt();
        depth2=input.nextInt();
        depth3=input.nextInt();
        depth4=input.nextInt();
        if(depth1<depth2&&depth2<depth3&&depth3<depth4){
            System.out.println("Fishing Rising");
        }
        else if(depth1>depth2&&depth2>depth3&&depth3>depth4){
            System.out.println("Fish Diving");
        }
        else if(depth1==depth2&&depth2==depth3&&depth3==depth4){
            System.out.println("Fish At Constant Depth");
        }
        else{System.out.println("No Fish");}      
    }
    
}