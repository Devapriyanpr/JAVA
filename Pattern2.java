import java.util.Scanner;
class Pattern2
   {
    public static void main(String[]args)
      {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter the number of Rows=");
      int Rows=scn.nextInt();
      for(int i=1;i<=Rows;i++)
        {                
            for(int j=1;j<=Rows;j++)
            {              
            if(i==1||i==Rows||j==1||j==Rows)
                { 
                System.out.print("* ");
                }
            else
                {
                 System.out.print("  ");
                } 
                  
            } 
                System.out.println();
       }
       
      }
   }