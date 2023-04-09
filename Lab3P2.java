//name:omar mohamed abdelfatah sha'rawyÚãÑ ãÍãÏ ÚÈÏ ÇáİÊÇÍ ÔÚÑÇæí  
package lab3.p2;

public class Lab3P2 {

    public static void main(String[] args) {
          Odometer obj1=new Odometer();
      obj1.setFuel(50);
      obj1.setMileage(30);
      obj1.setEfficiency(20.4);
      obj1.add(obj1.getMileage());
      obj1.reset();
      System.out.println("mies driven ="+Odometer.miles);
      System.out.println("fuel used ="+obj1.getFuel());
    }
    
}
