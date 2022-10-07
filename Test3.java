 
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
		int num1,num2,total;
		Scanner input = new Scanner(System.in);
		System.out.print("¿é¤J¦¨ÁZ: ");
		
		num1 = input.nextInt();
		num2 = num1/10;
		if(num1 > 100){
			System.out.print("¿é¤J¿ù»~");
		}else if(num1 <0){
			System.out.print("¿é¤J¿ù»~");
		}else{
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
 
} 