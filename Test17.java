import java.util.Scanner;
 
public class Test16 {
    public static void main(String[] args) {
		
		int[] a = {7,5,4,8,1,2};
		int b;
		int max=a[0],min=a[0];
		float avg=0;
		for (int x=0;x<a.length;x++){	 
			for (int i=x;i<a.length;i++){
			 
				if (a[x] > a[i]){
					b = a[i];
					a[i]=a[x];
					a[x]= b;		
				}
			}
		
		}
		float total=0;
		int mid=0;
		for (int x=0;x<a.length;x++){	 
				if(max <= a[x]) max=a[x];//最大
				if(min >= a[x]) min=a[x];//最小
				/////
				 
				total=total+a[x];
				
				avg=total/ a.length; //平均
				////
				
				mid=a[a.length/2-1];
		}
		System.out.println("最大值: "+max);
		System.out.println("最小值: "+min);
		System.out.println("平均值: "+avg);
		System.out.println("中位數: "+mid);
		
    }
 
}