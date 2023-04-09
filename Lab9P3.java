//«·«”„:⁄„— „Õ„œ ⁄»œ«·› «Õ
package lab9.p3;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lab9P3 {

    public static void main(String[] args) {
        int i=0;
        String name;
        String n1=null,n2=null,n3=null;
        StringTokenizer str;
        ArrayList <String>arr=new ArrayList<>();
        String ahmed="ahmed math physics";
        String ali="ali math physics";
        String manar="manar math";
        String Mohammed="Mohammed math";
        String mona="mona physics";
        String hanan="hanan physics";
        arr.add(ahmed);
        arr.add(ali);
        arr.add(manar);
        arr.add(Mohammed);
        arr.add(mona);
        arr.add(hanan);
        for(i=0;i<6;i++)
        {
            name=arr.get(i);
            str=new StringTokenizer(name);
            if(name.contains("math")&&name.contains("physics"))
            {
                if(n1==null)
                {
                    n1=str.nextToken();
                }
                else
                n1=n1+" "+str.nextToken();
            }
            else if(name.contains("math"))
            {
                if(n2==null)
                {
                    n2=str.nextToken();
                }
                else
                n2 +=" "+str.nextToken();
            }
            else
            {
                if(n3==null)
                {
                    n3=str.nextToken();
                }
                else
                n3 +=" "+str.nextToken();
            }
        }
        System.out.println("math and physics are :"+n1);
        System.out.println("math are :"+n2);
        System.out.println("physics are :"+n3);
    }
    
}
