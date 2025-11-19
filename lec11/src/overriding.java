

    class animal {
        void eat() {
            System.out.println("pizza!!");
        }
    }

    class dog extends animal {
        void eat() {
            System.out.println("biryani!!");
        }
    }
    public class overriding {
        public static void main(String[] args) {
            dog d1 = new dog();
            //animal s1=new dog();
            d1.eat();
        }
    }

