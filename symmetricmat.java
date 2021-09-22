import java.util.Scanner;
public class symmetricmat{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int row,col,i,j,flag=1;
   System.out.println("Enter the number of rows:");
   row=sc.nextInt();
   System.out.println("Enter the number of columns:");
   col=sc.nextInt();
   int mat[][]=new int[row][col];
   System.out.println("Enter the elements in matrix:");
     for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        mat[i][j]=sc.nextInt();
      }
   System.out.println("Matrix:");
     for (i = 0; i < row; i++)
      {
        for (j = 0; j < col; j++)
         {
           System.out.print(mat[i][j]+"\t");
         }
        System.out.println("");
       }


   System.out.println("The transpose matrix:");
     for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        System.out.print(mat[i][j]+"\t");
        System.out.println();
      }

   if(row!=col)
     { 
       System.out.println("The given matrix is not a square matrix");
     }
   else
   for(i=0;i<row;i++)
     {
        for(j=0;j<col;j++)
         {
            if(mat[i][j]!=mat[j][i])
             flag=0;
             break;
         }
     }
       
    if(flag==1)
      {
        System.out.println("The matrix is symmetric!");
      }
    else
      {
         System.out.println("The matrix is not symmetric!");
      }
    }
 }