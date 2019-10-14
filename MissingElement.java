public class MissingElement
{
  public static void main(String args[])
   { 
    int n=100;
    int a[]=new int [n];
    for(int i=0;i<n;i++)
     {
      if(i==9)
       continue;
       a[i]=i+1;
      }
  int sum=(n*(n+1))/2;
  int array_sum=0;
  for(int i=0;i<a.length;i++)
  {
array_sum=array_sum+a[i];
  }
System.out.print("missing number is :"+(sum-array_sum));
}
}

