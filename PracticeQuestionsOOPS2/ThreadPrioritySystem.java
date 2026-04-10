class ThreadPrioritySystem extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){
        ThreadPrioritySystem t1 = new ThreadPrioritySystem();
        ThreadPrioritySystem t2 = new ThreadPrioritySystem();
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}