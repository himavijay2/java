import java.util.Scanner;
class NegException extends Exception
{
    public NegException(String str)
    {
        System.out.println(str);
    }
}
public class posaverage {
    public static void main(String[] args){
        try {
            int i, n, sum=0;
            float average=0;
            int num[]=new int[40];
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            n = reader.nextInt();
            System.out.println("Enter the elements: ");
            for (i = 0; i < n; i++) {
                num[i] = reader.nextInt();
            }
            for(i=0;i<n;i++) {
                if (num[i] >= 0) {
                    sum = num[i] + sum;
                }
                else
                    throw new NegException("Entered number is negative");
            }
                average = sum/n;
                System.out.print("\nAverage = " +average);
        }
        catch (NegException neg) {
	    System.out.println("Exception caught");
            
        }
    }
}
