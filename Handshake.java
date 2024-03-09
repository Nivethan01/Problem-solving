import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int n=sc.nextInt();
	if(n==1)
	{
	    a=0;
	}
	if(n>=2)
	{
	    for(int i=0;i<n;i++)
	    {
	        a=a+i;
	    }
	    System.out.print(a);
	}
	}
}
