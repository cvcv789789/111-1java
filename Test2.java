 
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
		int num1,num2,total;
		Scanner input = new Scanner(System.in);
		System.out.print("¿é¤J¦¨ÁZ: ");
		
		num1 = input.nextInt();
		num2 = num1/10;
 		switch(num2){
		    case 9:
		        System.out.println("A");
			break;
		    case 8:
		        System.out.println("B");
			break;
		    case 7:
		        System.out.println("C");
			break;
		    case 6:
		        System.out.println("D");
			break;
		    default:
		        System.out.println("E");
			break;

		}

    }
 
} 