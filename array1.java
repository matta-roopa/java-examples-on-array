import java.util.*;
import java.io.*;
class array1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];

for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int p=0;
for(int i=0;i<n;i++)
p=p+a[i];

System.out.println("SUM:"+p+"AVG:"+p/n);
}
}
