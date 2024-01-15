import java.util.Scanner;


public class Salary {
   
float da,hra,gross,pf,net,basic;
  
  
   void setBasic()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the basic salary on an employee");
	   basic =sc.nextFloat();
	   da=basic*0.08f;
	   hra=basic*0.1f;
	   gross=basic+da+hra;
	   pf=gross*0.025f;
	   net=gross-pf;
   }
   float getBasic()
   {
	 System.out.println("Basic salary:" +basic);
	 return 0;
   }
   float getDa(){
	   System.out.println("da:" +da);
	   return 0;
   }
   float getHra(){
	   System.out.println("hra:" +hra);
	   return 0;
   }
   float getGross(){
	   System.out.println("Gross:" +gross);
	   return 0;
   }
   float getPf(){
	   System.out.println("pf:" +pf);
	   return 0;
   }
   float getNet(){
	   System.out.println("Net:" +net);
	   return 0;
   }
   public static void main(String[]args){           
	   Salary s1=new Salary();
	   s1.setBasic();
	   s1.getDa();
	   s1.getHra();
	   s1.getGross();
	   s1.getPf();
	   s1.getNet();	   
   }
   
}
   

   
   


