import java.util.Scanner;
 
public class Test19 {
    public static void main(String[] args) {
		int[]myArr = {7,5,4,9,8,1,2};
		int num=1;
		int input;
		System.out.print("幾個一組:");
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		int num1 = myArr.length/input;
	
		float avg=0,total=0;
		for(int i=0;i<myArr.length;i++){
			
			if (num1 != 0){
				if (num <=input){
					total=myArr[i]+total;
					num=num+1;
				
				}
				if (num > input){
					num=1;
					avg= total/input;
					total=0;
					System.out.print(" "+avg+" ,");
					num1=num1-1;
				} 
			}else{
				System.out.print(" "+myArr[i]+" ,");
				 
			}
			
			 
			
			
		}	
		 
    }
 
}