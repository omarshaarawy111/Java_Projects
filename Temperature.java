package temperature;
import java.util.Scanner;
public class Temperature {

    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public boolean isEthylFreezing() {
        if (this.temperature <= -173) {
            return true;
        }
        return false;
    }

    public boolean isEthylBoiling() {
        if (this.temperature >= 172) {
            return true;
        }
        return false;
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public Temperature() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Temperature obj = new Temperature();
        System.out.println("Please enter temperature 1");
        obj.setTemperature(scan.nextDouble());
        Temperature obj2 = new Temperature();
        System.out.println("Please enter temperature 2");
        obj2.setTemperature(scan.nextDouble());
        System.out.println(obj.getTemperature());
        System.out.println(obj.isEthylFreezing());
        System.out.println(obj.isEthylBoiling());
        System.out.println(obj2.isEthylFreezing());
        System.out.println(obj2.isEthylBoiling());
    }
}
