public class parallel_execution {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        My_thread3 t1 = new My_thread3();
        t1.start();
        /*try {
            t1.join();

        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println("timer" + " " + i);
        }
        try {
            Thread.sleep(10000);

        } catch (Exception e) {

        }
    }

   static class My_thread3 extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("---hiii----");
            for (int i = 0; i < 10; i++) {
                // System.out.println(i+"t1");
                System.out.println("downloading file....." + (i * 20) + "%");
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
//throw new RuntimeException(e);
                    System.out.println(e);
                }
            }
        }
    }
}


