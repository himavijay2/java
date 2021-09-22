import java.util.Scanner;
import java.lang.Thread;
class A extends Thread
{
public void run()
{
int s;
for(int i=1;i<=10;i++)
{
s=i*5;
System.out.println(i+"*5="+s);
}
}
}
class B extends Thread
{
public void run()
{

Scanner reader = new Scanner(System.in);
System.out.println("Enter the limit:");
int n=reader.nextInt();
for(int i=1;i<=n;i++)
{

System.out.println("Prime numbers are");
for(i=2;i<=n;i++)
{
int a=0;
for(int j=1;j<=i;j++)
{
    if(i%j==0)
    {
        a++;
    }
}
          
if(a==2)
{
    System.out.print(i+" ");
}
}
//System.out.println(i);
}
}
}
class ThreadTest
{
public static void main(String args[])
{
new A().start();
new B().start();
}
}