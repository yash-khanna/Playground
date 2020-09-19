// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
	try{
    	String array[]=str.split("/");
      	if(array.length<2){
			throw new Exception("Exception : java.lang.NullPointerException");
		}
    	for(int i=0;i<array.length;i++){
    		System.out.println("Splitted string at index "+i+" is : "+array[i]);
    	}
    }catch(Exception e){
    	System.out.println("Exception : java.lang.NullPointerException");
    }
    finally{
    	System.out.println("Inside finally block");
    }
  }
}