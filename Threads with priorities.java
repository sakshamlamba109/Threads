public class ThreadDemo extends Thread {
public void run(){
System.out.println("Threading Started");
if(Thread.currentThread().getName().equals("Thread 1")|| Thread.currentThread().getName().equals("Thread 2"))
try {
Thread.sleep(1000);
Thread.sleep(1000);
}
catch (InterruptedException e) {
System.out.println(e);
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
ThreadDemo t1 = new ThreadDemo();
ThreadDemo t2 = new ThreadDemo();
ThreadDemo t3 = new ThreadDemo();
ThreadDemo t4 = new ThreadDemo();
ThreadDemo t5 = new ThreadDemo();
t1.setPriority(10);
t2.setPriority(8);
t3.setPriority(6);
t4.setPriority(1);
t5.setPriority(4);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
if (t1.isAlive()){
System.out.println("Thread 1 is alive");
}
else {
System.out.println("Thread 1 is dead");
}
if (t2.isAlive()){
System.out.println("Thread 2 is alive");
}
else {
System.out.println("Thread 2 is dead");
}
if (t3.isAlive()){
System.out.println("Thread 3 is alive");
}
else {
System.out.println("Thread 3 is dead");
}
if (t4.isAlive()){
System.out.println("Thread 4 is alive");
}
else {
System.out.println("Thread 4 is dead");
}
if (t5.isAlive()){
System.out.println("Thread 5 is alive");
}
else {
System.out.println("Thread 5 is dead");
}
}
}