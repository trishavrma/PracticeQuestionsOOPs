class ChatApplication {
    public static void main(String[] args){
        Thread send = new Thread(() -> {
            System.out.println("Sending message");
        });
        Thread receive = new Thread(() -> {
            System.out.println("Receiving message");
        });
        send.start();
        receive.start();
    }
}