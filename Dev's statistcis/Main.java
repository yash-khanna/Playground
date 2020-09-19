// import the respective packages
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Main{
  public static void main(String[] args){
    //Try out your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n<=0){System.out.println("Invalid Input");}
    else{
    ArrayList <Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
    	int a=s.nextInt();
      	list.add(a);
    }
	Iterator<Integer> iter=list.iterator();
	int total=0;int elements=0;
    while(iter.hasNext()){
      	int a=iter.next();
      	boolean result=false;
    	for(int i=2;i<a;i++){
        	if(a%i==0){result=true;}
        }
		if(result==true){
          	//System.out.println(a);
        	total++;
        }elements++;
    }
     int b=elements-total;
    System.out.println("Number of prime marks: "+b);
    }
  }
}