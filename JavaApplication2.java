//name : omar mohamed abdelfatah sha'rawy ط¹ظ…ط± ظ…ط­ظ…ط¯ ط¹ط¨ط¯ط§ظ„ظپطھط§ط­ 
//assingment 1 (lab 1) (3)






package JavaApplication2;
import java.util.Scanner;
public class JavaApplication2{
public static void main (String[]args){
    double P; // purchase price
    double S; // salvage value
    double Y; // number of years which the item used
    double D; // striaght line method for computing theyearly depriciation
    Scanner f = new Scanner(System.in);
    System.out.println("please enter the  purchase price of theitem");
    P= f.nextDouble();
    System.out.println("Please enter the expected salvage value");
    S= f.nextDouble();
    System.out.println("Please enter expected number of years which the item used");
    Y= f.nextDouble();
    D=((P-S)/Y);
    System.out.println("theyearly depriciation" + D);
    







}





}
