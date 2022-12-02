import java.util.Scanner;
 
public class Test14 {
    public static void main(String[] args) {
		
		int[] a = {7,3,4,9,6};
		int b;
		for (int x=0;x<a.length;x++){
			for (int i=x;i<a.length;i++){
				if (a[x] > a[i]){
					b = a[i];
					a[i]=a[x];
					a[x]= b;			
				}
			}
			
		}
 
		for (int i=0;i<=a.length-1;i++){
			System.out.println(">>"+a[i]);
		}
    }
 
}