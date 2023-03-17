public class NumberPyramid
{
  public static void main( String [] str)
  {
    int n=5;
    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=(n-i); j++)
      {
        System.out.println(" ");
      }
      for(int j=1;j<=i; j++)
      {
       System.out.println( i);
      }
      System.out.println(" ");
    }
}