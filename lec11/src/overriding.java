
//over riding me ek se jyada classes hoti h
//isme jyadatar child class hi call hoti h
    class animal {
        void eat() {
            System.out.println("pizzaaaaaa!!");
        }


    }

    class dog extends animal {
        void eat() {
            System.out.println("biryaniiiii!!");
        }



        public class overriding {
            public static void main(String[] args) {
                //dog d1 = new dog();
                animal s1 = new dog();
                s1.eat();

            }
        }
    }

