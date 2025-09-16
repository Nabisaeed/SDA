package Inheritance;
public class Inheritance {

        public static void main(String[] args) {

            Vehicle v1= new Vehicle(2020, "Toyota");

           System.out.println("The model of the car is :"+v1.model);

           System.out.println("The brand of the car is :"+v1.brand);
         
            
        }
    
}

class Vehicle{

    int model;
    String brand;

    public Vehicle(int m, String b){

        this.model=m;
        this.brand=b;
    }

    public void start(){

        System.out.println("The car is starting ");
    }

      public void stop(){

        System.out.println("The car is stoping ");
    }


}


class Car extends Vehicle{

    public Car(int m, String b){

        super(m,b);



    }



    public void honk(){

        System.out.println("The car is honking");
    }
}
