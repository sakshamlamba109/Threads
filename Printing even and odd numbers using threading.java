import java.util.Scanner;
class EvenDemo
{
void even()
{
for(int i=0;i<100;i++)
{ if(i%2==0)
System.out.print(i+" ");
}
System.out.println(" ");
}
}
class OddDemo
{
void odd()
{
for(int i=0;i<100;i++)
{ if(i%2!=0)
System.out.print(i+" ");
}
}
}
public class EvenOddDemo implements Runnable {
EvenDemo dem;
OddDemo demo;
EvenOddDemo(EvenDemo a)
{
dem=a;
}
EvenOddDemo(OddDemo a)
{
demo=a;
}
public void run()
{
System.out.println("Enter choice");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(s.equals("Even"))
dem.even();
else
demo.odd();
}
public static void main(String[] args) {
// TODO Auto-generated method stub
EvenDemo a= new EvenDemo();
OddDemo b=new OddDemo();
EvenOddDemo t1=new EvenOddDemo(a);
EvenOddDemo t2=new EvenOddDemo(b);
Thread d=new Thread(t1);
Thread e=new Thread(t2);
d.start();
try {
d.join();
}
catch(InterruptedException f)
{
System.out.println(f);
}
e.start();
}
}