// import the respective packages
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    int denominator=s.nextInt();s.nextLine();
    int nominator=s.nextInt();s.nextLine();
    int size_array=s.nextInt();boolean b=false;
    try{
    	int a=nominator/denominator;
    }catch(Exception e){
    	System.out.println("In the catch block due to Exception = java.lang.ArithmeticException: / by zero");
    	b=true;
    }
    if(b==false && size_array!=0){
    	System.out.println("In the catch block due to Exception = java.lang.ArrayIndexOutOfBoundsException: "+size_array);
    }
	System.out.println("End Of Main");
  }
}