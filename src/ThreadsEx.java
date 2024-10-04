public  class ThreadsEx implements Runnable{
    public static void main(String[] args) {
        ThreadsEx t = new ThreadsEx();
        Thread thread = new Thread(t);
        thread.start();
    }
    public void run(){
        System.out.println("Task executed in a separate thread.");
    }
}
