import java.util.Scanner;
public class StringMan {
    public static void main(String args[]) {
        int num;
        Scanner reader = new Scanner(System.in);
	while(true)
	{
        	System.out.println("\nEnter your choice\n1.String length\n2.String concatination\n3.String compare \n4.String copy\n5.Exit");
        	num = reader.nextInt();
        	switch(num)
        	{
        		case 1:System.out.print("Enter String:");
                		String s1=reader.next();
                		int len=s1.length();
                		System.out.print("String Length is:"+len);
                		break;
        		case 2:System.out.print("Enter String1:");
                		String s2=reader.next();
                		System.out.print("Enter String2:");
                		String s3=reader.next();
                		String con=s2+s3;
                		System.out.println("The concatinated string is:"+con);
                		String st=s2.concat(s3);
                		System.out.println("Concatinated string using library function is:"+st);
                		break;
        		case 3:System.out.print("Enter String one:");
               			String s4=reader.next();
               			System.out.print("Enter String two:");
               			String s5=reader.next();
               			if(s4.equals(s5))
        			  {
          				   System.out.print("Strings are equal");
       
      				  }
               			else
          				   System.out.print("Strings are not equal");
          				 break;
        		case 4:System.out.print("Enter String one:");
               			String s6=reader.next();
               			System.out.print("Enter String two:");
               			String s7=reader.next();
               			s6=s7;
               			System.out.print("String copied is:"+s7);
				break;
			case 5:System.out.print("Exit");
			       return;
        	}
	}
    }
}
