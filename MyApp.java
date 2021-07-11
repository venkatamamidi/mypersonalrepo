public class MyApp implements Runnable {
    public void run() {
        for(int i = 0; i < 30; i++) {
            System.out.println("Thread Counter = " + i);
        }
    }
    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        Thread thread = new Thread(myApp);

        thread.start();
        
        for(int i = 0; i < 30; i++) {
            System.out.println("Main Counter = " + i);
        }

    }
}