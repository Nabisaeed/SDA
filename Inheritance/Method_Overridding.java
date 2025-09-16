package Inheritance;
public class Method_Overridding {

        public static void main(String[] args) {


            laptop l1= new laptop();

            l1.start();
            
        }
    
}


class Device{

    public void start(){

        System.err.println("The device is starting");
    }



}

class laptop extends Device{

    public void start(){

        System.out.println("The device is booting ");
    }



}
