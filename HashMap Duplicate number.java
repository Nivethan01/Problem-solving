
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int [] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		HashMap<Integer,Integer>j=new HashMap<>();
		for(int i=0;i<arr.length;i++){
		    if(j.containsKey(arr[i])){
		        j.put(arr[i],j.get(arr[i])+1);
		    }
		    else{
		        j.put(arr[i],1);
		    }
		    
		}
		//System.out.println(j);
		System.out.print("Enter the Duplicate element:");
		int a=sc.nextInt();
		if(j.containsKey(a)){
		   System.out.print(j.get(a)); 
		}
		else{
		    System.out.print("No number");
		}
		
	}
}
