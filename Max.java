import java.util.*;
public class Max
{
public static void main(String x[])
{
Scanner S=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter values in array");
for(int i=0;i<a.length;i++)
{
a[i]=S.nextInt();
}
int max=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.printf("%d",max);
}
}
