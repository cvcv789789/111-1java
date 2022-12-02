import java.util.Scanner;
 
public class User {
    public static void main(String[] args) {
		
		Car[] myCar = new Car[800];
		for (int x=0; x<800; x++){
			myCar[x] = new Car();
			myCar[x].wheel1 =x;
			myCar[x].wheel2 = x+1;
			myCar[x].wheel3 = x+2;
			myCar[x].wheel4 = x+3;
			int z = myCar[x].lanuch(7);
			int a=  myCar[x].wheel1;
			System.out.println(z);
			System.out.println(a);
			 
		}
	 
    }
 
}