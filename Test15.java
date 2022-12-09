import java.util.Scanner;
 
public class Test15 {
    public static void main(String[] args) {
		
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		int b= (a.length/2);
		int temp=2;
		int c=0;
 
		while(a[b]==temp){
			c=c+1;
		 
			if(a[b]<temp){
				
				b=b-1;
			}
			if(a[b]>temp){
				
				b=b+1;				
			}	
		
		}	
 
		 
		System.out.println("總共搜尋"+c+"次");
		 
    }
 
}