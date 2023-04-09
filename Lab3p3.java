//name:omar mohamed abdelfatah sha'rawy⁄„— „Õ„œ ⁄»œ «·› «Õ ‘⁄—«ÊÌ  
package lab3p3;


public class Lab3p3 {


    public static void main(String[] args) {
        Counter obj1=new Counter();
        Counter obj2=new Counter();
        obj1.inc();
        obj1.inc();
        obj1.inc();
        obj1.inc();
        obj2.inc();
        obj2.dec();
        obj2.dec();
        obj2.dec();
        obj2.printcount();
        obj2.inc();
        obj2.inc();
        obj2.inc();
        obj2.inc();
        System.out.println("count 1="+obj1.getCount());
        obj2.printcount();
        if(obj1.equal(obj2))
        {
            System.out.println("counters are equal");
        }
        else
        {
            System.out.println("Non equal");
        }
        
    }
    
}
