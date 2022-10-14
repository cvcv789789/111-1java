import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
		int row=0,b,c=1;
	
		while(row<5){		 
			c=0;
			b=0;
			while(b<4-row){		 
				System.out.print(" ");
				b=b+1;
			}
			while(c<=row*2){		 
				System.out.print("*");
				c=c+1;
			}
			System.out.println("");
			row=row+1;
		}
    }
 
} 