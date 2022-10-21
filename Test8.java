import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
		int row=0,b,c=-1,d;
		String a = "*";
		while(row<11){		 
			 
			if(row >5){
				b=row-5;
				c= c - 2;
			}else{
				b= 5- row;
				c= c + 2;
			}
			d= c; 
			while(b>0){		 
				System.out.print(" ");
				b=b-1;
			}
			while(d>0){		 
				System.out.print("*");
				d=d-1;
				 
			}
			 
			System.out.println("");
			 
			row=row+1;
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