import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();String str="";String abc="";
    for(int i=0;i<n;i++){
    	String a=s.next();
      	if(a.equals("0")==true){
        	str+=a;
        }else{
        	abc+=a;
        }
    }
    System.out.println(str+abc);
  }
}