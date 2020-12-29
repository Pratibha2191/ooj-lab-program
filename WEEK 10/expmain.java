import java.util.*;
class WrongAge extends Exception{
   private String detail;
   WrongAge(String s)
   {
       detail = s;
   }
  public String toString()
   {
       return("Invalid age exception:" +detail);
   }
}
class father
{
int age;
father(int x) throws WrongAge
{
age=x;
if(age<0)

    throw new WrongAge("Age cant be negative");

}
}
class son extends father{
   int age1;
   son(int fage,int sage)throws WrongAge{
       super(fage);
       age1=sage;
       if(age1>=age)
           throw new WrongAge("Son's age cant be greater than father's age");
   }
 
}
 
class expmain
{
   public static void main(String args[])
   {
       Scanner s =new Scanner(System.in);
       System.out.print("ENTER FATHER'S AGE: ");
       int m=s.nextInt();
       System.out.print("ENTER SON'S AGE: ");
       int n=s.nextInt();

       try{
        son ob = new son(m,n);
               
               System.out.println("Father's Age: "+ob.age);
               System.out.println("Son's Age: "+ob.age1);
           
       }
       catch(WrongAge e)
       {
           System.out.println(e);
       }
   }
}