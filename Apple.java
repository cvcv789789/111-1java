 
import java.util.Scanner;
public class Apple {
    public static void main(String[] args) {
		int num1,num2,total;
		Scanner input = new Scanner(System.in);
		System.out.print("��J���Z: ");
		num1 = input.nextInt();
 
		if(num1 >= 90){
			System.out.println("Very goood");
		}else if(num1>= 60){
			System.out.println("goood");
		}else{
			System.out.println("���ή�");
		};	
    }
 
} 