class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello world");
        }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        A t = new A();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("hi");
        }
    }
}