class Table implements Runnable{
 int num;
 Table(int n){
 this.num=n;
 }
 synchronized public void printable(){
 int n=this.num;
 for(int i=1;i<=10;i++){
 System.out.println(n+" X "+i+" = "+(i*n));
 }
 }
 public void run(){
 printable();
 }
 }
 public class tablemain{
 public static void main(String[] args) {
 new Thread(new Table(5)).start();
 new Thread(new Table(100)).start();
 }
 }