import java.lang.Runnable;

class FoldingDemo {

    public static void process(int register) {

        final int[] counter = new int[1];
        counter[0] = 0;

        checkAndStart((register > 10), new Runnable() {
            public void run() {
                counter[0]++;
                System.out.print(counter[0] + " ");
            }
        });
    }

    public static void checkAndStart(boolean flag, Runnable runnable){
        if(flag) runnable.run();
        else System.out.println("suspending");
    }

}