import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
		int row=0,b,c=2;
	
		while(row<=10){		 
			if(row>5){			 
				b=row-c;
				c=c+2; 
			}else{
				b=row;
			}
			while(b>0){		 
				System.out.print("*");
				b=b-1;
				
			}
			System.out.println("");
			row=row+1;
		}
    }
 
} 