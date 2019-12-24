import java.util.*;
import java.io.*;
class array3
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
for(int i=0;i<n;i++){
char c=(char)a[i];
System.out.print(c+" ");
}
}
}
