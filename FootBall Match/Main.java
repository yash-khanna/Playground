// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;

class FootballMatch{
	 void displayFootballMatchDate(String matchDate){     	
      	System.out.println("Match Date: "+matchDate.substring(3,5)+"-"+matchDate.substring(0,2)+"-"+matchDate.substring(6));
     }
  
  	void displayFootballMatchDetails(String[] array) {
      	String venue=array[0];
      	String country=array[1];
      	System.out.println("Match Venue:\nStadium: "+venue+"\nCountry: "+country);
    }
  
  	  void displayFootballMatchDetails(String winnerTeam, long goals){
      	System.out.println("Match Outcome: "+winnerTeam+" won by "+goals+" goals");
      }
  	
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n==1){
    	s.nextLine();
		String choice=s.next();
      	FootballMatch f=new FootballMatch();
		f.displayFootballMatchDate(choice);
    }else if(n==2){
    	s.nextLine();
      	String str=s.nextLine();
		String[] array=str.split(", ");
		FootballMatch f=new FootballMatch();
		f.displayFootballMatchDetails(array);
    }else if(n==3){
      s.nextLine();
      	String team=s.nextLine();
    	long goals=s.nextLong();
		FootballMatch f=new FootballMatch();
		f.displayFootballMatchDetails(team, goals);
    }else{
    	System.out.println("Invalid Input");
    }
  }
}