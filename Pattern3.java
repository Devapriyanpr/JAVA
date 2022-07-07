import java.util.Scanner;
class Pattern3
{
public static void main(String[]args)
 {
  Scanner scn=new Scanner(System.in);
  System.out.println("Enter the Number Of rows"); 
  int rows=scn.nextInt();
  for(int i=1;i<=rows;i++)
   {
    for(int j=rows;j>=i;j--)
     {
     System.out.println(" ");
     }
     for(int k=1;k<=i;k++)
     {
     System.out.println(k+" ");
     }
     System.out.println();
   }
 }
}