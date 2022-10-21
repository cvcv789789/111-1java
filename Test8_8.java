import java.util.Scanner;
public class Test8_8 {
    public static void main(String[] args) {
		int row=0,b,c=-1,d;
	 
		for (int i=0;i<5;i++){
				c=c+2;
				for(b=5-i;b>1;b--){
					System.out.print(" ");
				}
				for(int j=c;j>0;j--){
					System.out.print("*");
				}
				System.out.println("");
		}
		for (int i=5;i<11;i++){
			c=c-2;
			for(b=i-5;b>=0;b--){
				System.out.print(" ");
			}
			for(int j=c;j>0;j--){
				System.out.print("*");
			}
			System.out.println("");	
		}

    }
 
} 
/*
  *
 ***
*****
 ***
  * 
  */