import java.util.Scanner;
 
public class Test12 {
    public static void main(String[] args) {
		int total;
		System.out.print("公里數");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if (b<=7){
			total= 85;
			
		}else{
			total= 85+((b-7)*5);
		}
		System.out.println(total);
    }
 
}