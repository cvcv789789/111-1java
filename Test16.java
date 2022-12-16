import java.util.Scanner;
 
public class Test16 {
    public static void main(String[] args) {
		
		int[] a = {7,5,4,8,1,2};
		int b[] =new int[a.length];
		for (int i=0;i<a.length;i++){	 
				b[a.length-i-1]=a[i];
	
		}	
		 
		for (int i=0;i<a.length;i++){			
				a[i]=b[i];	
				System.out.println(a[i]);
		}	
 
    }
 
}