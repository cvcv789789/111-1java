import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
		int grade=1,grade1=0;
		String a = new String();
		while(grade<=5){	
			grade1=grade;
			while(grade1>0){	
				System.out.print("*");
				grade1=grade1-1;
			}
			System.out.println("");
			grade=grade+1;
		}
    }
 
} 