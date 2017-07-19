package Thread;

/**
 * Created by brahmanandakar on 20/07/17.
 */
public class basicThread {


    public static void main(String[] args) {

        Thread th=new Thread(()->{
            System.out.println("simple Thread");
        });

        Thread th2=new Thread(()->{
            for (int i = 0; i < 200; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Brahmananda kar ");
            }
        });


        th.start();
        th2.start();
    }



}
