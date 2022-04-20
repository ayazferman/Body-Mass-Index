import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		int weight;
		double height;
		System.out.print("Please input your weight(kg):");
		weight=inp.nextInt();
		System.out.print("Please input your height(cm):");
		height=inp.nextDouble();
		height=(height*height)/10000;
		double dmi=weight/height;
		System.out.println("Your body mass index is= " + dmi);

	}
}
