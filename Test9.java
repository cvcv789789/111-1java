import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
		int row=0,b=0,c=-1,d;
        String x = new String();
		for (int i=1;i<=6;i++){
			for(int j=6-i;j>0;j--){
				System.out.print("*");	
			}
			x= x+i;
			System.out.print(x);
			System.out.println("");	
		}
 
		 
	 

    }
 
}
/* 
用兩圈
*****1
****12
***123
**1234
*12345
*5
*/