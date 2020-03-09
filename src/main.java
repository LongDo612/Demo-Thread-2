public class main {
    public static void main(String[] args) {
        ThreadSimple t1 = new ThreadSimple();
        t1.start();
        RunnableSimple r1 = new RunnableSimple();
        Thread t2 = new Thread(r1);
        t2.start();


    }
}
