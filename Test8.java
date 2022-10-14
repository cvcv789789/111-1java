import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
		int row=0,b,c;
		String a = "*";
		while(row<9){		 
			 
			if(row >5){
				b=row-5;
			}else{
				b= 4- row;
			}
			
			while(b>0){		 
				System.out.print(" ");
				b=b-1;
			}
			
			System.out.println(a);
			a= a + "**";
			row=row+1;
		}
    }
 
} 