import java.util.Scanner;
 
public class Test17 {
    public static void main(String[] args) {
		int[]myArr = {7,5,4,9,8,1,2};
		int num;
		int[] flag =new int[myArr.length];
		int flag_count = 1;
		System.out.print("輸入第小數字:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int med=0;
		for(int i=0;i<num;i++){
			int flag_min=1000;
			int flag_min_index=0;
			for (int j=0;j<myArr.length;j++){
				if(myArr[j]<flag_min && flag[j]==0){
					flag_min=myArr[j];
					flag_min_index=j;
					
				}
			}
			flag[flag_min_index]=flag_count;
			flag_count++;
			med=myArr[flag_min_index];
		}	
		System.out.println(med);
    }
 
}