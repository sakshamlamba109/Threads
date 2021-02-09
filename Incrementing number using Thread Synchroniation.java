public class Increment implements Runnable {
int n=1;
public synchronized void run() {
System.out.println(n++);
}
public static void main(String args[])
{
Increment inc = new Increment();
Thread[] threads = new Thread[10];
for(int i=0;i<10;i++)
{
threads[i] = new Thread(inc);
threads[i].start();
}
} }