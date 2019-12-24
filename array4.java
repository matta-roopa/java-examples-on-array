import java.util.*;
import java.io.*;
class array4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int temp=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
System.out.println("MIN1:"+a[0]+"MIN2:"+a[1]+"MAX1:"+a[n-1]+"MAX2:"+a[n-2]);

}
}