// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;

class FootballPlayer{
	void displayFootballPlayerDetails(String playerName, String goalKeeperName){
    	System.out.println("Player details of the football: \nMain Player- "+playerName);
      	System.out.println("GoalKeeper- "+goalKeeperName);
    }
  
  	void displayFootballPlayerDetails(long goals){
    	System.out.println("Number of goals scored in the match: "+goals);
    }
  
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n==1){
    	s.nextLine();
      	String playerName=s.nextLine();
      	String goalKeeperName=s.nextLine();
      	FootballPlayer f=new FootballPlayer();
      	f.displayFootballPlayerDetails(playerName, goalKeeperName);
    }
    else if(n==2){
    	long numberofGoals=s.nextLong();
      	FootballPlayer f=new FootballPlayer();
      	f.displayFootballPlayerDetails(numberofGoals);
    }else{
    	System.out.println("Invalid Input");
    }
  }
}