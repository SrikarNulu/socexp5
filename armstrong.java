import java .util.*;
class armstrong
{
 public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter number:");
long x=sc.nextLong();
long sum=0;
long n=x;
while(x!=0)
{
long r=x%10;
sum+=(r*r*r);
x/=10;
}
if(sum==n)
{
System.out.println("number is armstrong");
}
else
{
System.out.println("number is not armstrong");
}}}
