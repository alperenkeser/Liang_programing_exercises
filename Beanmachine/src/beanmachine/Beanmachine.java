
package beanmachine;

import java.util.Scanner;

public class Beanmachine {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of balls:");
        int balls = input.nextInt();
        System.out.print("Number of slots:");
        int slots = input.nextInt();
        int[] slotarray = new int[slots+1];
        String LR;
        for(int i=0;i<balls;i++){
            int b=0;
            for (int j = 0; j < slots-1; j++) {
                int a=(int)(Math.random()*2);
                b+=a;
                if(a==0){
                    LR="L";
                }
                else{
                    LR="R";
                }
                System.out.print(LR);
            }
            slotarray[b]+=1;
            System.out.println();
        }
         for (int i = 0; i < slots; i++) {
            if(slotarray[i]==0) continue;
            System.out.print(i + ". ");
             for (int j = 0; j < slotarray[i]; j++) {
                 System.out.print("O");
             }
             System.out.println();
        }
        
        
 
    }
    
}
