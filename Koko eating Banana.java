
import java.util.*;
public class Main
{
    public static int calc(int[] pile,int h){
        int total=0;
        for(int i:pile){
            total+=Math.ceil((double)i/(double)h);
        }
        return total;
    }
	public static void main(String[] args) {
	    int[] pile={805306368,805306368,805306368};
	    int h=1000000000,max=0;
	    for(int i=0;i<pile.length;i++){
	        max=Math.max(max,pile[i]);
	    }
	    int s=1,e=max;
	    while(s<=e){
	        int mid=s+(e-s)/2;
	        int total=calc(pile,mid);
	        if(total<=h){
	            e=mid-1;
	        }
	        else{
	            s=mid+1; 
	        }
	    }
		System.out.println(s);
	}
}
