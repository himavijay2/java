import java.util.Scanner;

class Cpu{
int price;
class Processor{                
               
               String Manufacturer, No_of_Cores;

                 }


   
    class Ram
    {                  
              String Manufacturer;
              int memory;
       
                    }

    Cpu.Ram rb = new Cpu.Ram();                    

    Processor p = new Processor();                  
   
 

    void Input(){

   
      Scanner in = new Scanner(System.in);
   
        System.out.println("---Enter The CPU Details---");    
   
        System.out.print("Enter RAM Manufacture Name : ");
         rb.Manufacturer=in.next();
 
        System.out.print("Enter RAM Memory : ");
         rb.memory=in.nextInt();
       
         
        System.out.print("Enter Processor Manufacture Name : ");
         p.Manufacturer=in.next();
 
        System.out.print("Enter No.Of.Cores : ");
         p.No_of_Cores=in.next();

        System.out.print("Enter CPU Price : ");
        price=in.nextInt();
    }


   void display(){
       
        System.out.println("--CPU Details--");      
       
        System.out.println("RAM Manufacture Name : "+ rb.Manufacturer);
       
        System.out.println("RAM Memory : "+ rb.memory);
       
        System.out.println("Processor Manufacture Name : "+ p.Manufacturer);
       
        System.out.println("No.Of.Cores : "+ p.No_of_Cores);

        System.out.println("CPU Price : "+ price);
       
 
   }



}


class Computer{

public static void main(String args[]){

   Cpu ob = new Cpu();                          
 
   ob.Input();                            
   
   ob.display();                              


}}
