//name : omar mohamed abdelfatah عمر محمد عبدالفتاح
//lab 2 (3)
//assingnment 2
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author hp
 */
public class JavaApplication3 {

   
    public static void main(String[] args) {
int flag=0;
do{
        double x;
        do{
        int re;
        int i;
        
        double sum=0;
        double Q;
        
        factorial f1=new factorial();//create class calculate factorial
        Scanner f=new Scanner(System.in);
        
        System.out.println(" please enter the value of x");
        x=f.nextDouble();
        
        System.out.println("enter the value of reapeting (choose 10 or 50 or 100)");
        re=f.nextInt();
        if (re!=50 && re!=100 && re!=10){
        
        
        System.out.println("wrong");
        }
        else{
            
        
        for (i=0;i<=re;i++){
        Q=Math.pow(x, i)/i;
        sum=sum+Q;
        }
        System.out.println("the sum is " + sum);
        
        System.out.println(" u wanna through or not 1 for yes 0 for no");
        flag=f.nextInt();
}
 
 }       while(flag==1);
        }
    
        
        
        
        
        
        
    
    

