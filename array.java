import java.util.*;
import java.io.*;
class array
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int p=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
p=p+a[i];
}
System.out.println("sum "+p);
int l=p/n;
System.out.println("AVERAGE"+l);
}
}
