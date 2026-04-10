class Restaurant {
    boolean ready = false;
    synchronized void prepare() throws Exception{
        System.out.println("Chef prepared food");
        ready = true;
        notify();
    }
    synchronized void serve() throws Exception{
        while(!ready){
            wait();
        }
        System.out.println("Waiter served food");
    }
    public static void main(String[] args){
        Restaurant r = new Restaurant();
        new Thread(() -> {
            try{ r.serve(); }catch(Exception e){}
        }).start();
        new Thread(() -> {
            try{ r.prepare(); }catch(Exception e){}
        }).start();
    }
}