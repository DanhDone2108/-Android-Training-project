public class ThreadEx2 extends Thread {
    public static void main(String[] args) {
        ThreadEx2 t = new ThreadEx2();
        t.start();
    }
    public void run() {
        System.out.println("Thread executed");
    }

}
