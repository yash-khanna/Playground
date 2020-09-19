// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
   if(n>0){
	System.out.println("View Employee's Salary Confidential details");
	for(int i=0;i<n;i++){
    	String name=s.next();
      	long salary=s.nextLong();
		SalaryConfi s1=new SalaryConfi();
      	s1.setName(name);
      	s1.setSalary(salary);
      	System.out.println("Name of the Employee: "+s1.getName());
      	System.out.println("Salary of "+s1.getName()+": "+s1.getSalary());
    }}else{System.out.println("Invalid Input");}
  }
}
class SalaryConfi{
	String name;long salary;
	public void setName(String name){
    	this.name=name;
    }
  	public void setSalary(long salary){
    	this.salary=salary;
    }
  
  	public String getName(){
    	return this.name;
    }
  
  	public long getSalary(){
    	return this.salary;
    }
}