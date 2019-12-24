import java.util.*;
import java.io.*;
class array
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
int p=a[0],m=a[0];
for(int i=0;i<n;i++)
{
if(p<a[i])
p=a[i];
if(m>a[i])
m=a[i];
}

System.out.println("MIN:"+m+"MAX:"+p);
}
}
