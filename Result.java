import java.util.Scanner;
 class Sports {
    Double sscore;
    public void sgrade(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the sports score : ");
        sscore = reader.nextDouble();
    }
}
class Studentt extends Sports{
    Double mark;
    public void smark(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the academic score : ");
        mark = reader.nextDouble();
    }
}
class Result extends Studentt{
    public static void main(String args[]){
        Result r1=new Result();
        Result r3=new Result();
        r1.sgrade();
        r1.smark();
        System.out.print("The sports score is "+r1.sscore+" \n");
        System.out.print("The academic score is "+r1.mark+" \n");
    }
}