import java.util.Scanner;
public class Test9_9 {
    public static void main(String[] args) {
	 
        String x = new String();
		for (int i=1;i<=6;i++){
			for(int j=6 ;j>0;j--){
				if(j-i-1>=0){
					System.out.print("*");	
				}else{
					System.out.print(i - j+1);	
				};
				 
			}
			 
			System.out.println("");	
		}
 
		 
	 

    }
 
}