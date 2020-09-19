// import the respective packages
import java.util.Scanner;
interface func{
	public int fact(int n);
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n<0){System.out.println("Invalid Input");}
    else{
    	func f=(l)->{
			if(l==0){return 1;}
          	int total=1;
        	for(int i=1;i<=l;i++){
            	total*=i;
            }return total;
        };
		System.out.println(f.fact(n));
    }
  }
}