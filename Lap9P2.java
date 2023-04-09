//ÇáÇÓã:ÚãÑ ãÍãÏ ÚÈÏÇáİÊÇÍ
package lap9.p2;
import java.util.ArrayList;
import java.util.Random;
public class Lap9P2 {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        int even=0,odd=0,temp=0;
        Random num=new Random();
        for(int i=0;i<100;i++)
        {
            numbers.add(num.nextInt());
        }
        for(int i=0;i<100;i++)
        {
            temp=numbers.get(i);
            if(temp%2==0)
            {
                even+=temp;
            }
            else
            {
                odd+=temp;
            }
        }
        System.out.println("even sum = "+even);
        System.out.println("odd sum = "+odd);

    }
    
}
