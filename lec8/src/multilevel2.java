public class multilevel2 {
    public static void main(String[]args){
        GamingLaptop g= new GamingLaptop();
        g.PowerOn();
        g.Boot();
        g.startGame();
    }
}

    class Device{
        void PowerOn(){
            System.out.println("Device is powered on");
        }
    }
    class Laptop extends Device{
        void Boot(){
            System.out.println("Laptop is booting");
        }
    }
    class GamingLaptop extends Laptop{
        void startGame(){
            System.out.println("Game is starting on laptop");
        }
    }
