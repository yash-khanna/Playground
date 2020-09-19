// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
class Racer{
	String Country;
  	public Racer(String s){this.Country=s;}
  
  	public void displayDetails() {
    	
    }  	
}

class BikeRacer extends Racer{
	String racerName;
	Long age;
  	String racerUsedVehicleName;
  	Long  awardsWon;
  	public void displayDetails(String c){
      	
    	System.out.println("Country: "+c+"\nRacer Name: "+this.racerName+"\nAge of the racer: "+this.age);
      	System.out.println("Vehical Name: "+this.racerUsedVehicleName+"\nNumber of awards: "+this.awardsWon);
    }
  
  	public BikeRacer(String s,Long l,String s1,Long l1,String country){
      	super(country);
    	this.racerName=s;this.age=l;this.racerUsedVehicleName=s1;this.awardsWon=l1;
    }
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    String country=s.next();
    String choice=s.next();
    int n=Integer.parseInt(choice);
    if(n==1){
    	s.nextLine();
      	String name=s.nextLine();
      	Long age=s.nextLong();s.nextLine();
      	String vehicleName=s.nextLine();
      	Long numberofAwards=s.nextLong();
      	BikeRacer b=new BikeRacer(name,age,vehicleName,numberofAwards,country);
      	b.displayDetails(country);
    }else if(n==2){
    	//s.nextLine();
      	s.nextLine();
      	String name=s.nextLine();
      	Long age=s.nextLong();s.nextLine();
      	String vehicleName=s.nextLine();
      	Long numberofAwards=s.nextLong();
      	BikeRacer b=new BikeRacer(name,age,vehicleName,numberofAwards,country);
      	b.displayDetails(country);  	
    }else{
    	System.out.println("Invalid Input");
    }
  }
}
