import java.util.Scanner;
 
public class Test10 {
    public static void main(String[] args) {
	 
		int a;
		int k=7;
		 
		System.out.print(k); 
		Test11 t11 = new Test11();
		a = t11.add(k,4);
		System.out.printf("%d%n",a);
		 

    }
 
}
class Test11{
	public int add(int x, int y){
		int t =x + y;
		return t;
	}
	
}