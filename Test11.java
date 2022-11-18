import java.util.Scanner;
 
public class Test11 {
    public static void main(String[] args) {
		int a=1 , b=5;
		for (int i=1; i<=9;i++){
			int a2= a;
			int b2= b;
			for(int j=1;j<=11;j++){
				if(b2 !=0){
					System.out.print("*");
					b2=b2-1;
				}else if(a2 !=0){
					System.out.print(".");
					a2=a2-1;
				}else{
					System.out.print("*");
				}
			}
			if (i>=5){
				b=b+1;
				a=a-2;
			}else{
				b=b-1;
				a=a+2;
			}
		 
				System.out.println("");
		}
		
    }
 
}
 