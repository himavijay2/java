import java.util.Scanner;
public class StringMan {
    public static void main(String args[]) {
        int num;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT OPTION\n 1.STRING LENGTH\n2.STRING CONCATANATION\n3.STRING EQUAL \n4.STRING COPY");
        num = sc.nextInt();
        switch(num)
        {
        case 1:System.out.print("Enter String:");
                String s1=sc.next();
                int len=s1.length();
                System.out.print("String Length is:"+len);
                break;
        case 2:System.out.print("Enter String1:");
                String s2=sc.next();
                System.out.print("Enter String2:");
                String s3=sc.next();
                String con=s2+s3;
                System.out.println("The concatinated string is:"+con);
                String st=s2.concat(s3);
                System.out.println("Concatinated string using library function is:"+st);
                break;
        case 3:System.out.print("Enter String one:");
               String st1=sc.next();
               System.out.print("Enter String two:");
               String st2=sc.next();
               if(st1.equals(st2))
        {
             System.out.print(" Strings are equal");
       
        }
               else
          System.out.print("Strings are not equal");
          break;
        case 4:System.out.print("Enter String one");
               String st3=sc.next();
               System.out.print("Enter String one:");
               String st4=sc.next();
               st4=st3;
               System.out.print("STRING COPIED IS:"+st4);
        }
    }
}
