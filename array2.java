import java.util.*;
import java.io.*;
class array2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int c=0,q=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int p=s.nextInt();
for(int i=0;i<n;i++)
{
if(p==a[i])
{
c++;
 q=i;
}
}
if(c==1)
System.out.println(q);
else
System.out.println(-1);
}
}
