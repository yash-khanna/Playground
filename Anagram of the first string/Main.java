import java.util.Scanner;
class Main
{
  public static void main(String args[]){
		Scanner s=new Scanner(System.in);
    	String abc=s.next();
		String def=s.next();
		abc=mergeSort(abc,0,abc.length()-1);
		def=mergeSort(def,0,def.length()-1);
		//System.out.println(abc+" "+def);
    	if(abc.equals(def)==true){
        	System.out.println("Anagram");
        }else{
        	System.out.println("Not anagrams");
        }
	}

	public static String mergeSort(String str,int start,int end){
		if(start==end){
			return str.substring(start,start+1);
		}
		int mid=(start+end)/2;
		String first=mergeSort(str,start,mid);
		String second=mergeSort(str,mid+1,end);
		String result=merge(first,second);
		return result;
	}

	public static String merge(String first,String second){
		int i,j;
		i=0;
		j=0;
		String result="";
		while(i<first.length() && j<second.length()){
			if((int)first.charAt(i)>(int)second.charAt(j)){
				result+=second.substring(j,j+1);j++;
			}else{
				result+=first.substring(i,i+1);i++;
			}			
		}
		//System.out.println(first+" "+second+" "+result);
		while(i<first.length()){
			result+=first.substring(i,i+1);i++;
		}

		while(j<second.length()){
			result+=second.substring(j,j+1);j++;
		}
		return result;
	}

}