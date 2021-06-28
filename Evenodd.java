import java.util.*;
public class Evenodd
{
public static void main(String args[])
{
int n,m;
System.out.println("enter two numbers to print even numbers in reverse order");
Scanner s=new Scanner(System.in);
m=s.nextInt();
n=s.nextInt();
while(m>=n)
{
if((m&1)==0)
{
System.out.println(m);
}
m--;
}
}
}


out put:
25
8
24
22
20
18
16
14
12
10
