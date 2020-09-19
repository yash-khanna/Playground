// import the respective packages
import java.util.Scanner;
interface a{
	public void print(String str);
}
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    		int n=s.nextInt();
    		String str1=Integer.toString(n);
    		a practice= (str)->{
      			while(str.length()!=1){
    					int total=0;
    					for(int i=0;i<str.length();i++){
    						total+=Integer.parseInt(str.substring(i,i+1));
    					}
    					str=Integer.toString(total);
					//System.out.println("\n"+str);
    				}//System.out.println(str);
      				if(str.equals("1")){System.out.print(" is a Magic Number.");}
      				else{System.out.println(" is not a Magic Number.");}
  		};
		System.out.print(str1);
    		practice.print(str1);
  }
}