class Father
{

static void acceptNameF(int inputAge) throws ArithmeticException
{
try
{
if(inputAge<0)
throw new ArithmeticException("Wrong Age");
}
catch (ArithmeticException e) {
System.out.println("Caught " + e);
}
}



}
class Son extends Father
{

static void CheckSFage(int S_Age, int F_Age) throws ArithmeticException

{
try{
if(S_Age>=F_Age)
throw new ArithmeticException("Son's age should be smaller than father's age ,wrong age");
System.out.println("Son's age is"+S_Age+"Fathers age is "+F_Age);


}
catch (ArithmeticException e) {
System.out.println("FCaught " + e);
}

}
}
public class ExceptionHandling{
public static void main(String args[]) {
 

Father.acceptNameF(-10);
Son.CheckSFage(30,20);


}
}
