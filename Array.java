import java.util.*;
public class Array
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
int sum=0;
System.out.println("enter a values in array");

for(int i=0;i<a.length;i++)
{

a[i]=xyz.nextInt();

}
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.printf("%d",sum);
}
}
