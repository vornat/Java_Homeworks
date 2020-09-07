package hw.telran.application;
import hw.telran.data.Smartphone;
import org.w3c.dom.ls.LSOutput;

public class SmartphoneApplication {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Samsung","Android",5.8,8,128);
        Smartphone smartphone2 = new Smartphone("Apple","iOS 12",6.1,4, 256);
        Smartphone smartphone3 = new Smartphone();

        System.out.println(smartphone1.getInternalStorage());
        System.out.println(smartphone2);

       smartphone1.getPrice();
       smartphone2.getPrice();
       smartphone3.getPrice();

    }
}
