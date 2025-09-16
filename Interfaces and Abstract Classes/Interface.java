public class Interface {

        public static void main(String[] args) {

            M_Player m1= new M_Player();
            m1.play();
            
        }
    
}

interface Iplayble{

    void play();
    void pause();
}


class M_Player implements Iplayble {

    public void play(){

        System.out.println("The music is running");
    }

     public void pause(){

        System.out.println("The music is stopped ");
    }


}
