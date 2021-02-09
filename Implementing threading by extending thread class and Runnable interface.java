//(a)- By implementing Runnable Interface:

public class ImplementsDemo implements Runnable {
public void run()
{
System.out.println("Java is a great language");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
ImplementsDemo t1= new ImplementsDemo();
Thread a= new Thread(t1);
a.start();
}
}



//(b)-By extending Thread Class CODE:


public class ExtendsDemo extends Thread{
public void run() {
System.out.println("Java is a great language");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
ExtendsDemo obj= new ExtendsDemo();
obj.start();
}
}