package src;

public class example {

    public static void main(String[] args) {


        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("boom");
            }
        };
t.run();

    }
}