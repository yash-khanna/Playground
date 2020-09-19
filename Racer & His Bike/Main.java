// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
class BasicInfoOfBike{
	String model;Long mileage;
  	BasicInfoOfBike(String model,Long mileage){
    	this.model=model;this.mileage=mileage;
    }
  
  	public void displayDetails(){
    String bikeOwnedBy; String color;String bikeNumber; 
    }
}

class AdvancedInfoOfBike extends BasicInfoOfBike{
    String bikeOwnedBy; String color;String bikeNumber;
  	public AdvancedInfoOfBike(String b,String c,String b1,String d,Long e){
    super(d,e);
    this.bikeOwnedBy=b;this.color=c;this.bikeNumber=b1;
    }
  	
  	public void displayDetails(){
    
    }
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    String model=s.nextLine();
    Long mileage=s.nextLong();s.nextLine();
    String company=s.nextLine();
    String color=s.nextLine();
    String number=s.nextLine();
    System.out.println("Bike Details: \nBike model: "+model+"\nMileage: "+mileage+" km/l");
    System.out.println("Company name: "+company+"\nBike color: "+color+"\nBike Number: "+number);
  }
}