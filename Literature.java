import java.util.Scanner;

class Publisher{
Scanner sc=new Scanner(System.in);
 
   String name;
   Publisher(){
  name=" ";
  }
   void publisher()
   {
   System.out.println("Enter The Name Of Publisher:");
   name=sc.next();
   
   }
}

class Book extends Publisher{
Scanner sc= new Scanner(System.in);
String book;
Book()
{
book="";
}
void book()
{
   
  System.out.println("Enter The Name Of Book:");
  book=sc.next();
   }
}
class Fiction extends Book{
String Fic;
Fiction()
{
Fic="";
}
void fiction()
{
System.out.println("Fiction or Nonfiction:");
Fic=sc.next();
}
}
class Literature extends Fiction{
String lit;
Literature()
{
lit="";
}
void literature()
{
System.out.println("Enter The Type Of Literature:");
lit=sc.next();
}

   
 
void display()
{

System.out.println("Name of Publisher:"+name);
System.out.println("Name of Book:"+book);
System.out.println("Fiction or Nonfiction:"+Fic);
System.out.println("Literature Type:"+lit);

}



   public static void main(String args[]){
 
 
  Literature ob=new Literature();
 
  ob.publisher();
  ob.book();
  ob.fiction();
  ob.literature();
  System.out.println("--DETAILS--");

  ob.display();
 
  }
 
 


 
 
   }  